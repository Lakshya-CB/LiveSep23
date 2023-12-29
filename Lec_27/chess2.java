package Lec_27;

import java.util.ArrayList;
import java.util.List;

public class chess2 {
	 static int cnt = 0;
	public static void main(String[] args) {
		int n = 3;
//		move(0, 0, n, "");
		List<Integer> Primes = allPrimes(n);
		System.out.println(Primes);
		
//		System.out.println(isMine(1, 1, Primes, n));
		move(0, 0, n, "", Primes);
		System.out.println("\n"+cnt);
	}

	public static void move(int r, int c, int n, String path, List<Integer> Primes) {

		if (r == n - 1 && c == n - 1) {
			System.out.print(path + "{" + r + "-" + c + "}"+" ");
			cnt++;
			return;
		}
		if (r >= n || c >= n || isMine(r, c, Primes, n)) {
			return;
		}
		if (isPort(r, c, Primes, n)) {
			move(n - 1, n - 1, n, path + "{" + r + "-" + c + "}P", Primes);
		}
//		knight!!
		move(r + 2, c + 1, n, path + "{" + r + "-" + c + "}K", Primes);
		move(r + 1, c + 2, n, path + "{" + r + "-" + c + "}K", Primes);
//		rook!!
		if (r == 0 || c == 0 || r == n - 1 || c == n - 1) {
			for (int C = c + 1; C < n; C++) {
				move(r, C, n, path + "{" + r + "-" + c + "}R", Primes);
			}
			for (int R = r + 1; R < n; R++) {
				move(R, c, n, path + "{" + r + "-" + c + "}R", Primes);
			}
			
		}
//		Bishop!
		if (r + c == n - 1 || r == c) {
			int R = r + 1;
			int C = c + 1;
			while (R < n && C < n) {
				move(R, C, n, path + "{" + r + "-" + c + "}B", Primes);
				R++;
				C++;
			}
		}
	}

	private static boolean isMine(int r, int c, List<Integer> primes, int n) {
		int curr = r * n + c + 1;
		int idx = primes.indexOf(curr);
//		System.out.println(idx);
		if (idx == -1 || idx % 2 == 1) {
			return false;
		}
		return true;
	}

	private static boolean isPort(int r, int c, List<Integer> primes, int n) {
		int curr = r * n + c + 1;
		int idx = primes.indexOf(curr);
		if (idx % 2 == 1) {
			return true;
		}
		return false;
	}

	public static List<Integer> allPrimes(int n) {
		List<Integer> Primes = new ArrayList<>();
		for (int num = 2; num <= n * n; num++) {
			boolean isP = true;
			for (int div = 2; div * div <= num; div++) {
				if (num % div == 0) {
					isP = false;
					break;
				}
			}
			if (isP) {
				Primes.add(num);
			}
		}
		return Primes;
	}
}
