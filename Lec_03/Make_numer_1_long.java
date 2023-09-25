package Lec_03;

import java.util.Scanner;

public class Make_numer_1_long {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long cnt = 1;
		long sum = 0;
		long mult = 1;
		while (cnt <= n) {
			long digit = scn.nextLong();
			sum = sum + digit * mult;
			mult = mult * 10;
			cnt++;
		}
		System.out.println(sum);
	}
}
