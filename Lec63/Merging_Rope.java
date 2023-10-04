package Lec63;

import java.util.PriorityQueue;

public class Merging_Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 5, 7 };
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum = sum + a + b;
			pq.add(a + b);
		}
		System.out.println(sum);

	}

}
