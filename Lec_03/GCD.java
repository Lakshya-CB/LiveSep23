package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 42;
		int divisor = num1;
		int dividend = num2;
		int R = 99;
		while (divisor>0) {
			R = dividend % divisor;
			dividend = divisor;
			divisor = R;
		}
//		System.out.println(R);
//		System.out.println(divisor);
		System.out.println(dividend);
		
	}
}
