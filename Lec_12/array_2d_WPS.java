package Lec_12;

import java.util.Iterator;

public class array_2d_WPS {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15 } };
		spiral(arr);

	}

	public static void wavevy(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.println(arr[row][col]);
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.println(arr[row][col]);
				}
			}
		}
	}

	public static void spiral2(int[][] arr) {
		int minR = 0;
		int maxR = arr.length - 1;
		int minC = 0;
		int maxC = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int cnt = 0;
		while (minC <= maxC && minR <= maxR) {
			for (int r = minR; r <= maxR && cnt < total; r++) {
				System.out.print(arr[r][minC] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = minC + 1; c <= maxC && cnt < total; c++) {
				System.out.print(arr[maxR][c] + " ");
				cnt++;
			}
			System.out.println();

			for (int r = maxR - 1; r >= minR && cnt < total; r--) {
				System.out.print(arr[r][maxC] + " ");
				cnt++;
			}
			System.out.println();

			for (int c = maxC - 1; c >= minC + 1 && cnt < total; c--) {
				System.out.print(arr[minR][c] + " ");
				cnt++;
			}
			System.out.println();

			minR++;
			minC++;

			maxR--;
			maxC--;
		}

	}

	public static void spiral(int[][] arr) {
		int minR = 0;
		int maxR = arr.length - 1;
		int minC = 0;
		int maxC = arr[0].length - 1;
		while (minC <= maxC && minR <= maxR) {
			for (int r = minR; r <= maxR; r++) {
				System.out.print(arr[r][minC] + " ");
			}
			System.out.println();

			for (int c = minC + 1; c <= maxC; c++) {
				System.out.print(arr[maxR][c] + " ");
			}
			System.out.println();

			for (int r = maxR - 1; r >= minR && minC != maxC; r--) {
				System.out.print(arr[r][maxC] + " ");
			}
			System.out.println();

			for (int c = maxC - 1; c >= minC + 1 && minR != maxR; c--) {
				System.out.print(arr[minR][c] + " ");

			}
			System.out.println();

			minR++;
			minC++;

			maxR--;
			maxC--;
		}

	}

	public static boolean findSorted(int[][] arr, int ali) {
		int r = arr.length - 1;
		int c = 0;

		while (r >= 0 && c < arr[0].length) {
			if (arr[r][c] == ali) {
				return true;
			} else if (arr[r][c] < ali) {
				c++;
			} else {
				r--;
			}

		}
		return false;

	}

}
