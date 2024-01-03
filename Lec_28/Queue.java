package Lec_28;

public class Queue {
	int[] arr;
	int s;
	int size;

	public Queue(int cap) {

		arr = new int[cap];
		s = 0;
		size = 0;
	}

	public Queue() {
		this(5);
	}

	public int size() {
		return size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public void add(int ali) {
		int idx = (s + size) % arr.length;
		arr[idx] = ali;
		size++;
	}

	public int poll() {
		int ans = arr[s];
		s++;
		s = s % arr.length;
		return ans;
	}
	public int peek() {
		return arr[s];
	}
}
