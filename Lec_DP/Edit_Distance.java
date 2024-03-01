package Lec_DP;

public class Edit_Distance {
	public static void main(String[] args) {
		String str1 = "horse";
		String str2 = "ros";
	}

	public static int solve(int idx1, int idx2, String str1, String str2) {
		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			return solve(idx1 + 1, idx2 + 1, str1, str2);
		} else {
			int D = solve(idx1 + 1, idx2, str1, str2);
			int I = solve(idx1, idx2 + 1, str1, str2);
			int R = solve(idx1 + 1, idx2 + 1, str1, str2);
			return Math.min(I,Math.min(R, D));

		}
	}
}
