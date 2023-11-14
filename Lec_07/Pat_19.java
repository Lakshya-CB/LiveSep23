package Lec_07;

public class Pat_19 {
	public static void main(String[] args) {
		int n = 19;
		int row = 1;
		int total_st = n / 2 + 1;
		int total_sp = -1;
		while (row <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}

			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st2 = 0;
			if (row == 1 || row == n) {
				cnt_st2 = 1;
			}
			while (cnt_st2 < total_st) {
				System.out.print("* ");
				cnt_st2++;
			}

			if (row <= n / 2) {
				total_st--;
				total_sp = total_sp + 2;
			} else {
				total_st++;
				total_sp = total_sp - 2;

			}
			row++;
			System.out.println();
		}
	}
}
