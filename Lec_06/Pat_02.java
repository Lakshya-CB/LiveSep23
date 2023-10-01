package Lec_06;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int total_st = 1;
		while (row <= n) {

//			Step 2: star print

			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			total_st++;//B
			row++;
		}
	}
}
