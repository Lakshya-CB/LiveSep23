package Lec_21;

import java.util.Arrays;

public class merge_sooooooooooort {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 21, 22, 41, 99 };
		System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];

		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx3] = arr1[idx1];
				idx1++;
				idx3++;
			} else {
				ans[idx3] = arr2[idx2];
				idx2++;
				idx3++;
			}
		}
		while (idx1 < arr1.length) {
			ans[idx3] = arr1[idx1];
			idx1++;
			idx3++;
		}
		while (idx2 < arr2.length) {
			ans[idx3] = arr2[idx2];
			idx2++;
			idx3++;
		}
		return ans;
	}

	public static int[] mergeSort(int s, int e, int[] arr) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = mergeSort(s, mid, arr);
		int[] sp2 = mergeSort(mid + 1, e, arr);
		return mergeArrays(sp1, sp2);

	}

}
