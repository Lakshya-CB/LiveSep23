package Lec_14;

public class String_demo_2 {
	public static void main(String[] args) {
		int n = 100000;
		
		long start = System.currentTimeMillis();
		
		String str = "";
		for (int i = 1; i <= n; i++) {
			str = str + i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/1000.0);
		
	}
}
