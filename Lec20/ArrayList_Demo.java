package Lec20;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1, 50);// index ka range 0 to size
		System.out.println(list);
		// remove
		System.out.println(list.remove(3));// index ka range 0 to size-1
		System.out.println(list);
		list.add(2);
		list.add(3);
		// get
		System.out.println(list.get(2));
		System.out.println(list);
		list.set(3,-90);// value ko upadte krta hai 
		System.out.println(list);
	}

}
