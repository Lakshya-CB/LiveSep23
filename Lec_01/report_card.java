package Lec_01;

public class report_card {
	public static void main(String[] args) {
		int marks = 54;
		
		if (60 < marks && marks <= 70) {
			System.out.println("D");
		} else if (70 < marks && marks <= 80) {
			System.out.println("C");
		} else if (50 < marks && marks <= 60) {
			System.out.println("E");
		} else if (80 < marks && marks <= 90) {
			System.out.println("B");
		} else if (90 < marks && marks <= 100) {
			System.out.println("A");
		} else {
			System.out.println("F");
		}
	}
}
