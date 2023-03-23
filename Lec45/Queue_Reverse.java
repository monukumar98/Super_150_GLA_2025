package Lec45;

import Lec44.Dynamic_Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(1);
		dq.Enqueue(12);
		dq.Enqueue(13);
		dq.Enqueue(15);
		dq.Enqueue(18);
		dq.Display();
		Reverse(dq);
		dq.Display();
	}

	public static void Reverse(Dynamic_Queue dq) throws Exception {
		if (dq.isEmpty()) {
			return;
		}
		int x = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(x);
	}
}
