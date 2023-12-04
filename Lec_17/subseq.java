package Lec_17;

public class subseq {
	public static void main(String[] args) {
//		solve("abc", "");
		LKC("23","");

	}

	public static void solve(String frens, String party) {
		if (frens.isEmpty()) {
			System.out.println(party);
			return;
		}

		// fiends => "abcd"
//		sp : "bcd"

		char ch = frens.charAt(0);
		String sp = frens.substring(1); // "bcd"
		solve(sp, party + ch); // include
		solve(sp, party); // exclude!!

	}

	public static void LKC(String buttons, String path) {
		if(buttons.isEmpty()) {
			System.out.println(path);
			return;
		}
//		BP : "652"
//		SP : "52"
		String sp = buttons.substring(1); // "52"
		String ops = fn(buttons.charAt(0)); // "mno"
		for (int i = 0; i < ops.length(); i++) {
			LKC(sp, path + ops.charAt(i));
		}

	}

	private static String fn(char ch) {
		// TODO Auto-generated method stub
		String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

//		return arr[ch]; // 1
		return arr[ch - '0']; // 2
	}
}
