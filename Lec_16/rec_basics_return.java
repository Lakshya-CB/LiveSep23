package Lec_16;

public class rec_basics_return {
	public static void main(String[] args) {
//		System.out.println(Pow(10, 3));
//		System.out.println(Fact(3));
		System.out.println(Fibo(4));
	}

	public static int Pow(int a, int b) {
//		BP : Pow(a,b)
//		SP : Pow(a,b-1)
		if (b == 0) {
			return 1;
		}
		int sp = Pow(a, b - 1);

		return sp * a;
	}

	public static int Pow2(int a, int b) {
//		BP : Pow(a,b)
//		SP : Pow(a,b-1)
		if (b == 0) {
			return 1;
		}
		int sp = Pow2(a, b / 2);

		if (b % 2 == 0) {
			return sp * sp;
		} else {
			return sp * sp * a;
		}
	}

	public static int Fact(int n) {
//		BP : Fact(n)
//		SP : Fact(n-1)
		if (n == 0) {
			return 1;
		}
		int sp = Fact(n - 1);
		return sp * n;
	}

	public static int Fibo(int n) {
//		BP : Fibo(n)
//		SP : Fibo(n-1), Fibo(n-2)
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);

		return sp1 + sp2;
	}

}
