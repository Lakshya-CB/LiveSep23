package Lec_26;

public class Stack {

	private int tos;
	private int[] arr;

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		tos = -1;
		arr = new int[cap];
	}

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5); //
	}

	public int Size() {
		return tos + 1;
	}

	public int Peek() {
		if(isEmpty()) {
			throw new RuntimeException("Kya deekh rha hein? ");
		}
		return arr[tos];
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

	public boolean isFull() {
		return Size() == arr.length;
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("kya daal rha hein ?!");
		}
		tos++;
		arr[tos] =ali;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kya nikal rha hein ?!");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public void print() {
		System.out.print("[ ");
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("]");
	}
}
