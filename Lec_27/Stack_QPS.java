package Lec_27;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		System.out.println(S);
		reverse(S);
		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGr2(arr);
	}

	public static void reverse(Stack<Integer> S) {
		Stack<Integer> Ex1 = new Stack<>();
		while (!S.isEmpty()) {
			Ex1.add(S.pop());
		}
		Stack<Integer> Ex2 = new Stack<>();
		while (!Ex1.isEmpty()) {
			Ex2.add(Ex1.pop());
		}
		while (!Ex2.isEmpty()) {
			S.add(Ex2.pop());
		}
	}

	public static void nextGr8(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
//			 find all the As

			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}

			S.add(B);
		}
	}

	public static void nextGr2(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int idx = 0;
		for (int B : arr) {
//			 find all the As

			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(ans[A_idx] + "=>" + B);
			}
			S.add(idx);
			idx++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
