package Lec_07;

public class rotate2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 52;

		int nod = 0;
		int baackup = num;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		rot = rot % nod;
		System.out.println(nod);
		num = baackup;

		int div = (int) Math.pow(10, rot);
		int p1 = num / div;
		int p2 = num % div;
		System.out.println(p1 + " - " + p2);
		System.out.println(p2 * (int) Math.pow(10, nod - rot) + p1);
	}
}
