package Lec_DP;

public class LCS {
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "awbebcf";
		System.out.println(solveTD(0, 0, str1, str2, new Integer[str1.length()][str2.length()]));
	}

	public static int solveTD(int idx1, int idx2, String str1, String str2,
			Integer[][] dp) {
		if(idx1==str1.length()|| idx2==str2.length()) {
			return 0;
		}
		if(dp[idx1][idx2]!=null) {
			return dp[idx1][idx2];
		}
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			dp[idx1][idx2]= 1 + solveTD(idx1 + 1, idx2 + 1, str1, str2,dp);
			return dp[idx1][idx2];
		}
		int sp1 = solveTD(idx1+1, idx2, str1, str2,dp);
		int sp2 = solveTD(idx1, idx2+1, str1, str2,dp);
		dp[idx1][idx2]=  Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
	public static int BU(String str1, String str2) {
		int[][] dp =new int[str1.length()+1][str2.length()+1];
		for(int idx1 = str1.length()-1;idx1>=0;idx1--) {
			for(int idx2 = str2.length()-1;idx2>=0;idx2--) {
//			dp[idx1][idx2]	
				if (str1.charAt(idx1) == str2.charAt(idx2)) {
					dp[idx1][idx2]= 1 + dp[idx1 + 1][ idx2 + 1];
					continue;
				}
				int sp1 = dp[idx1+1][ idx2];
				int sp2 = dp[idx1][ idx2+1];
				dp[idx1][idx2]=  Math.max(sp1, sp2);
			}
		}
		return dp[0][0];
	}
}
