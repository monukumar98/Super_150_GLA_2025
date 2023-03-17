package Lec43;

public class Stack {
	private int[] arr;
	int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		tos = -1;
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		tos = -1;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public boolean isfull() {
		return tos == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Bklol stack full hai");
		}
		tos++;
		arr[tos] = item;
	}

	public int size() {
		return tos + 1;
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack Empty hai");
		}
		int x = arr[tos];
		tos--;
		return x;

	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack Empty hai");
		}
		int x = arr[tos];
		return x;

	}

	public void Display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(arr[i] + "->");

		}
		System.out.println(".");

	}

}
