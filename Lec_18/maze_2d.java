package Lec_18;

public class maze_2d {
	public static void main(String[] args) {
		chal(0, 0, "", 2, 2);
	}

	public static void chal(int r, int c, String str, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
			System.out.println(str);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}
		chal(r, c + 1, str + "R", dest_r, dest_c);
		chal(r + 1, c, str + "D", dest_r, dest_c);

	}
}
