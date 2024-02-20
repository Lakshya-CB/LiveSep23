package Lec_DP;

public class Stairs_basics {
	public static void main(String[] args) {
		int n = 3000;
		System.out.println(climb(0, n, new Integer[n + 1]));

	}

	public static int climb(int curr, int dest, Integer[] dp) {
		if (curr == dest) {
			return 1;
		}
		if (curr > dest) {
			return 0;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = climb(curr + 1, dest, dp);
		int sp2 = climb(curr + 2, dest, dp);
		dp[curr] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int dest) {
		int[] dp = new int[dest + 2];
		for (int curr = dest; curr >= 0; curr++) {
//			curr = 4;
			if (curr == dest) {
				dp[curr]=1;
				continue;
			}
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
			dp[curr] = sp1 + sp2;
		}
		return dp[0];

	}

//	public static int climb(int curr, int dest, String path) {
//		if (curr == dest) {
//			System.out.println(path);
//			return 1;
//		}
//		if (curr > dest) {
//			return 0;
//		}
//		int sp1 = climb(curr + 1, dest, path + 1);
//		int sp2 = climb(curr + 2, dest, path + 2);
//		return sp1 + sp2;
//	}

}
