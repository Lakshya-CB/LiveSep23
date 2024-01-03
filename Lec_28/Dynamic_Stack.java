package Lec_28;

import Lec_26.Stack;

public class Dynamic_Stack extends Stack{

	@Override
	public void add(int ali) {
		if(isFull()) {
			grow();
		}
		super.add(ali);
	}

	private void grow() {
		int[] big=  new int[this.arr.length*2];
		for(int i=0;i<=tos;i++) {
			big[i] =this.arr[i];
		}
		this.arr = big;
	}
}
