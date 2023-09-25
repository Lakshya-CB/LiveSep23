package Lec_03;

import java.util.Scanner;

public class Make_numer_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = 1;
		int sum = 0;
		int mult = 1;
		while (cnt <= n) {
			int digit = scn.nextInt();
			sum = sum + digit * mult;
			mult = mult * 10;
			cnt++;
		}
		System.out.println(sum);
	}
}
