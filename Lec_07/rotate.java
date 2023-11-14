package Lec_07;

public class rotate {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 4;

		int nod = 0;
		int baackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		rot = rot % nod;
		System.out.println(nod);
		num = baackup;
		for (int i = 0; i < rot; i++) {

			int p1 = num / 10;
			int p2 = num % 10;
//			System.out.println(p1 + " - " + p2);
			int mult = (int) Math.pow(10, nod - 1);
//			System.out.println(p2 * mult + p1);
			num = p2 * mult + p1;
			System.out.println(num);

		}
	}
}
