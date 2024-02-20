package Lec_DP;

public class Fibo_basic {
	public static void main(String[] args) {
		int n = 10000;
		System.out.println(FiboTD(n, new Integer[n + 1]));
	}

	public static int FiboTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) { // uses that solution
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
//		Fibo(n) = sp1+sp2;!!
		dp[n] = sp1 + sp2; // memorizes!!
		return sp1 + sp2;
	}

	public static int BU(int N) { // Step 1)
//		input Argument => Biggest Problem!!
		///////////////////////////////////////
//		basic intuition
//		i want to fill my dp array iteratively 
//		and return the biggest problem!! 
		///////////////////////////////////
		int[] dp = new int[N + 1]; // Step 6) Finalize Dp array size!!!
		// Step 2) create DP array. DO NOT THINK ABOUT THE SIZE

		// Step 3) Loop to fill your Dp array!! Smalles to BIggest!!
		for (int n = 0; n <= N; n++) {
//			Step 4) calculate current sub problem!! => dp[n]!!
//			Self work!!
//			Step 5) Base case!!
			if (n <= 1) {
				dp[n] = n;
				continue;
			}
			
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
//			Fibo(n) = sp1+sp2;!!
			dp[n] = sp1 + sp2;
		}
//		Step 7) return biggest problem!!
		return dp[N];
	}
}
