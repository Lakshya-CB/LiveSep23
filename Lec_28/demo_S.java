package Lec_28;

import Lec_26.Stack;

public class demo_S {
	public static void main(String[] args) {
		Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.print();

		S.add(60);
		S.print();
	}
}
