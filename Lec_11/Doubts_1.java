package Lec_11;

import java.util.Scanner;

public class Doubts_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();

		for (int i = 0; i < T; i++) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int answer = root(M, N);
			System.out.println(answer);
		}
	}

	public static int root(int M, int N) {
		int s = 1;
		int e = M;
		int ans = -1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (Math.pow(mid, N) == M) {
				ans = mid;
				return ans;
			} else if (Math.pow(mid, N) < M) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return ans;
	}
}
