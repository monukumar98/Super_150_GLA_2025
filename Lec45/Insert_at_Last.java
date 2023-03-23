package Lec45;

import java.util.Stack;

public class Insert_at_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(11);
		st.push(18);
		System.out.println(st);
		Insert(st, 8);
		System.out.println(st);
	}

	public static void Insert(Stack<Integer> st, int ele) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(ele);
			return;
		}
		int item = st.pop();
		Insert(st, ele);
		st.push(item);

	}

}
