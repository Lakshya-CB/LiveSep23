package Lec_14;

public class string_demo2 {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str3 = str1.substring(0, 2);
		String str4 = str3.intern();

		String str2 = "ab";

		System.out.println(str3 == str2);
		System.out.println(str4 == str2);
	}
}
