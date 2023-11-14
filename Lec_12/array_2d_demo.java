package Lec_12;

public class array_2d_demo {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; // Row Cols!!
		System.out.println(arr);
		System.out.println(arr.length);// rows!

		for (int[] row : arr) {
			System.out.println(row);
			for (int ali : row) {
				System.out.print(ali + " - ");
			}
			System.out.println();
		}
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;

		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;

		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;

	}
}
