package Lec_20;

public class permutation {
	public static void main(String[] args) {
		int n = 4;
		int r = 2;

//		perm(r, n, "", new boolean[n]);
//		comb(r, n, "", -1);
		combSeat(0, r, "", n);
	}

	public static void perm(int toPick, int totalBoxes, String path, boolean[] picked) {
		if (toPick == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = 0; curr < totalBoxes; curr++) {
//			box!!  curr box mein pick kar rha hun!!
			if (picked[curr] == false) {
				picked[curr] = true;
				perm(toPick - 1, totalBoxes, path + "b" + curr, picked);
				picked[curr] = false;
			}
		}
	}

//	wrt to PT teacher!!
	public static void comb(int toPick, int totalBoxes, String path, int prev) {
		if (toPick == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < totalBoxes; curr++) {
//			box!!  curr box mein pick kar rha hun!!
//			curr = 2;
			comb(toPick - 1, totalBoxes, path + "b" + curr, curr);
		}
	}

	public static void combSeat(int curr, int toPlace, String path, int totalSeats) {
		if (toPlace == 0) {
			System.out.println(path);
			return;
		}
		if (curr == totalSeats) {
			return;
		}
		combSeat(curr + 1, toPlace - 1, path + "Q" + curr, totalSeats);
		combSeat(curr + 1, toPlace, path, totalSeats);
	}

}
