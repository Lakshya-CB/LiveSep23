package Lec_04;

public class Prime {
	public static void main(String[] args) {
		int num = 4*9;
		int div = 2;
		int var = 0;
		while (num > 1) {
			if (num % div == 0) {
				if (var == 0) {
					System.out.println(div);
					var = 1;
				}

				num = num / div;
			} else {
				div++;
				var = 0;
			}
		}
	}
}
