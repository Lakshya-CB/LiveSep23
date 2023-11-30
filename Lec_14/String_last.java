package Lec_14;

import java.util.Scanner;

public class String_last {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		String str = "abcd";

		System.out.println(str + str.length());
/////////////////
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));
////////////////////////
		System.out.println(str.startsWith("ab"));
		System.out.println(str.endsWith("cd"));
		//////////////////
		System.out.println(str.indexOf("abcd")); // first occ!!
		System.out.println(str.lastIndexOf("abcd")); // last occ!!
		//////////////////
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, str.length()));
//		////////////
		char[] arr = str.toCharArray();
//		System.out.println(arr);
		for (char ch : arr) {
			System.out.println(ch + " - ");
		}
		String str2 = "the  sky  is  blue";
		String[] arr1 = str2.split(" ");
		for (String s : arr1) {
			System.out.println("-" + s + "-");
		}
//		/////////////////

	}
}
