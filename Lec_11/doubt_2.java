package Lec_11;

import java.util.Arrays;
import java.util.Scanner;

public class doubt_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[N];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] res = new int[arr1.length];

		int i = 0, j = 0, k = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = i; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr2[j] = Integer.MAX_VALUE;
					res[k] = arr1[i];
					k++;
					break;
				}
			}
		}
		// System.out.println(count);
		System.out.print("[");
		for (int idx = 0; idx <= k; idx++) {
			if (idx == k) {
				System.out.print(res[idx]);
			} else {
				System.out.print(res[idx] + ", ");
			}
		}
		System.out.println("]");

	}
}
