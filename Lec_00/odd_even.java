package Lec_00;

public class odd_even {
	public static void main(String[] args) {
		int num = 10;
		int Q = num / 100;
		int R = num % 100;
		System.out.println(Q);
		System.out.println(R);
		if(R*10 +100==0*10+100) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
