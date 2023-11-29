package Lec_15;

public class Rec_1 {
	public static void main(String[] args) {
//		PD(4);
//		PI(4);
		PDI(4);
	}

	public static void PDI(int n) {
//		BP : PDI(n)
//		SP : PDI(n-1)
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PD(int n) {
		if (n == 1) {
			System.out.println(1);
			return;
		}
//		Bp : PD(n)
//		SP : PD(n-1)

		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int n) {
//		BP : PI(n)
//		SP : PI(n-1)
		if (n == 1) {
			System.out.println(1);
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}
}
