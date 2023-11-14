package Lec_12;

public class array_2d_demo_2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int cnt = 1;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = cnt;
				cnt++;
			}
		}
	
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}
}
