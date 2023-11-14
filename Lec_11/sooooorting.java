package Lec_11;

import java.util.Arrays;

public class sooooorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };

		System.out.println(Arrays.toString(arr));
		Instertion(arr);
//		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt <= arr.length - 1; cnt++) {
			for (int s = 0; s <= arr.length - 1 - cnt; s++) {
//			s and s+1!!
				if (arr[s] > arr[s + 1]) {
					int tem = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = tem;
				}
			}
//			System.out.println(Arrays.toString(arr));
		}
	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
//		read all the elements from 0 to last!!
//		find the max element index and swap it with last!!
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max_idx]) {
					max_idx = i;
				}
			}
//		swap!! 
			int temp = arr[last];
			arr[last] = arr[max_idx];
			arr[max_idx] = temp;
			System.out.println(Arrays.toString(arr));

		}

	}

	public static void Instertion(int[] arr) {
//		int[] arr = {10,20,30,40,5}
		for (int last_idx = 1; last_idx <= arr.length - 1; last_idx++) {
			int ali = arr[last_idx];
			int idx = last_idx - 1;
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));
			System.out.println("==========");
		}

	}

}
