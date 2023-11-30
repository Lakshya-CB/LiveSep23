package Lec_16;

public class rev_multi_1 {
	public static void main(String[] args) {
//		CoinToss(2, "");
		climbStairs(0, "", 3);
	}

	public static void climbStairs(int curr, String path, int dest) {
//		BP : (0,path)
		if (curr == dest) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr > dest) { // -ve BC
			return;
		}
		climbStairs(curr + 1, path + 1, dest);
		climbStairs(curr + 2, path + 2, dest);
	}

	public static void CoinToss(int n, String path) {
//		BP : CT(n)
//		SP : CT(n-1)
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CoinToss(n - 1, path + "H");
		CoinToss(n - 1, path + "T");
	}
}
