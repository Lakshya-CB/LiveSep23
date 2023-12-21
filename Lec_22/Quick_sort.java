package Lec_22;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		quick(0, arr.length-1, arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int s, int e, int[] arr) {
		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		int pivot = arr[mid];
		int L = s;
		int R = e;
		while (true) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			} else {
				break;
			}
		}
		quick(s, R, arr);
		quick(L, e, arr);
	}
}
