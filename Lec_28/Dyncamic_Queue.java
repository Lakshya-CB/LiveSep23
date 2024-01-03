package Lec_28;

public class Dyncamic_Queue extends Queue {
	@Override
	public void add(int ali) {
		if (isFull()) {
			grow();
		}
		super.add(ali);
	}

	private void grow() {
		// TODO Auto-generated method stub
		int[] biggy = new int[arr.length * 2];
		int i=0;
		for (int idx = s; idx < s + size(); idx++) {
			biggy[i] = arr[idx];
			i++;
		}
		arr = biggy;
	}
}
