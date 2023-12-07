package Lec_20;

public class board_2d {
	public static void main(String[] args) {
		int n = 5;
		comb2D(0, 0, n, "", n, n, new boolean[n][n]);

	}

	public static void comb2D(int r, int c, int toPlace, String path, int totalR, int totalC, boolean[][] board) {
		if (toPlace == 0) {
			System.out.println(path);
			print(board);
			return;
		}
		if (c == totalC) {
			r++;
			c = 0;
		}
		if (r == totalR) {
			return;
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			comb2D(r, c + 1, toPlace - 1, path + "Q{" + r + "," + c + "}", totalR, totalC, board);
			board[r][c] = false;
		}
		comb2D(r, c + 1, toPlace, path, totalR, totalC, board);
	}

	private static void print(boolean[][] board) {
		for (boolean[] arr : board) {
			for (boolean b : arr) {
				if (b) {
					System.out.print("Q");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("================");

	}

	private static boolean isSafe(int r, int c, boolean[][] board) {
		for (int R = 0; R <= r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
		for (int C = 0; C <= c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		int R1 = r;
		int C1 = c;
		while (R1 >= 0 && C1 >= 0) {
			if (board[R1][C1]) {
				return false;
			}
			R1--;
			C1--;
		}
		int R2 = r;
		int C2 = c;
		while (R2 >= 0 && C2 < board[0].length) {
			if (board[R2][C2]) {
				return false;
			}
			R2--;
			C2++;
		}

		return true;
	}
}
