package Lec_05;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;
			int A_max = 10;
			int H_max = 10;
			int phone = 1;
			int A = 0;
			int H = 0;
			while (true) {
//			P1=> A
				A = A + phone;
				phone++;
				if (A > A_max) {
					System.out.println("harshit");
					break;
				}

//			P2=> H
				H = H + phone;
				phone++;
				if (H > H_max) {
					System.out.println("ayush");
					break;
				}
			}

			
		}
	}
}
