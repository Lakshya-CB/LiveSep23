package Lec_06;

public class Pat_08 {
	public static void main(String[] args) {
		int n = 11;

		int row = 1;
		int total_st = n;
		while (row <= n) {

//			Step 2: Work in wach row!!
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (cnt_st + 1 == row || cnt_st + row == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cnt_st++;
			}

			System.out.println();
			row++;
		}
	}
}
