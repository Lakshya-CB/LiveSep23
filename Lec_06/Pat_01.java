package Lec_06;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 10;
		
		int row = 1;
		int total_st = n;
		while(row<=n) {
			
//			Step 2: Work in wach row!!
			int cnt_st =0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			
			System.out.println();
			row++;
		}
	}
}
