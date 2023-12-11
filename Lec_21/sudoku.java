package Lec_21;

public class sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(0, 0, board);
	}

	public static void solve(int r, int c, char[][] board) {
		if (c == 9) {
			c = 0;
			r++;
		}
		if (r == 9) {
			print(board);
			System.out.println("--=-==-=-=-=-=-=--");
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(ch, board, r, c)) {
					board[r][c] = ch;
					solve(r, c + 1, board);
				}
			}
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(char ch, char[][] board, int r, int c) {
		for (int R = 0; R < 9; R++) {
			if (board[R][c] == ch) {
				return false;
			}
		}

		for (int C = 0; C < 9; C++) {
			if (board[r][C] == ch) {
				return false;
			}
		}
		int RBox = r/3;
		int CBox = c/3;
		for(int R = RBox*3;R<RBox*3+3;R++) {
			
			for(int C = CBox*3;C<CBox*3+3;C++) {
				if (board[R][C] == ch) {
					return false;
				}			
			}
		}
		return true;
	}

	public static void print(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}