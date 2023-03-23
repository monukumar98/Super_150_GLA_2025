package Lec44;

public class Dynamic_Queue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + i) % arr.length;
				a[i] = arr[idx];

			}
			front = 0;
			arr = a;
		}
		super.Enqueue(item);

	}

}
