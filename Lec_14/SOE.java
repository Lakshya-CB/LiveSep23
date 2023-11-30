package Lec_14;

public class SOE {
	public static void main(String[] args) {
		solve(250000000);
	}

	public static void solve(int n) {
		boolean[] isComposite = new boolean[n + 1];
		for (int div = 2; div * div <= n; div++) {
			// table of div!!
			if (isComposite[div]) {
				continue;
			}
			for (int table = div * div; table <= n; table = table + div) {
				isComposite[table] = true;
			}
		}
		for (int num = 2; num <= n; num++) {
			if (!isComposite[num]) {
				System.out.println(num + "-" + isComposite[num]);
			}
		}
	}
}
