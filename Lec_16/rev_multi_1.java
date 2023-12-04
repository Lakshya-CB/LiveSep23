package Lec_16;

public class rev_multi_1 {
	public static void main(String[] args) {
//		CoinToss(2, "");
//		climbStairs(0, "", 3);
		climbStairsDice(0, "", 8);
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

	public static void climbStairsDice(int curr, String path, int dest) {
//		BP : (0,path)
		if (curr == dest) { // +ve BC
			System.out.println(path);
			return;
		}
		if (curr > dest) { // -ve BC
			return;
		}
		for (int step = 1; step <= 6; step++) {
			climbStairsDice(curr + step, path + step, dest);
		}
//		climbStairsDice(curr + 1, path + 1, dest);
//		climbStairsDice(curr + 2, path + 2, dest);
//		climbStairsDice(curr + 3, path + 3, dest);
//		climbStairsDice(curr + 4, path + 4, dest);
//		climbStairsDice(curr + 5, path + 5, dest);
//		climbStairsDice(curr + 6, path + 6, dest);

//		}
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
