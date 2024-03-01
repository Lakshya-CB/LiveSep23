package Lec_DP;

public class Coin_change {
//	static int ans = 0;

	public static void main(String[] args) {
		int Amount = 10000;
		int[] coins = { 1, 2, 3 };
		System.out.println(BU(Amount, coins));
//		solve(0, Amount, coins);
//		System.out.println(solveTD(0, Amount, coins, new Integer[coins.length][Amount + 1]));
	}

	public static int solve(int idx, int A, int[] coins) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		int sp1 = solve(idx, A - coins[idx], coins); // inc
		int sp2 = solve(idx + 1, A, coins); // exc
		return sp1 + sp2;
	}

	public static int solveTD(int idx, int A, int[] coins, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[idx][A] != null) {
			return dp[idx][A];
		}
		int sp1 = solveTD(idx, A - coins[idx], coins, dp); // inc
		int sp2 = solveTD(idx + 1, A, coins, dp); // exc
		dp[idx][A] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[coins.length + 1][Amount + 1];
		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
//				dp[1][10]!!
				if (A == 0) {
					dp[idx][A] = 1;
					continue;
				}

				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[idx][A - coins[idx]]; // inc
				}
				int sp2 = dp[idx + 1][A]; // exc
				dp[idx][A] = sp1 + sp2;
			}
		}
		return dp[0][Amount];
	}
//	public static void solve(int idx, int A, int[] coins, String path) {
//		if (A == 0) {
//			System.out.println(path);
//			ans++;
//			return;
//		}
//		if (A < 0 || idx == coins.length) {
//			return;
//		}
//		solve(idx, A - coins[idx], coins, path + coins[idx]); // inc
//		solve(idx + 1, A, coins, path); // exc
//
//	}
}
