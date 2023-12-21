package Lec_22;

import java.util.Scanner;

public class subset_Sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {1 ,4, 6, 5, 3};
		int A = 10;
		choose(0, arr, "", A);
	}
	public static void choose(int idx, int[] arr, String path, int sum) {

		if (sum == 0) {
			System.out.println(path);
			return;
		}
		if (sum < 0 || idx == arr.length) { // -ve bc
			return;
		}
		choose(idx + 1, arr, path, sum);
		choose(idx + 1, arr, arr[idx] + " " + path, sum - arr[idx]);

	}
}
