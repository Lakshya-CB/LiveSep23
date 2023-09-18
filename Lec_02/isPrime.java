package Lec_02;

public class isPrime {
	public static void main(String[] args) {
		int n = 6;
		int div = 1;
		int numOfFac = 0;
		while (div <= n) {
			int R = n % div;
			System.out.println(div + "-" + R);
			if (R == 0) {
				numOfFac = numOfFac + 1;
			}
//			div = div + 1;
			div++;
		}
		System.out.println(numOfFac);
		if(numOfFac==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
}
