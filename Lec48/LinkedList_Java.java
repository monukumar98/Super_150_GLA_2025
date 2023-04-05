package Lec48;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(1);
		list.add(0, -9);
		list.add(1, 12);
		System.out.println(list);
		System.out.println(list.get(1));
		// System.out.println(list.remove());//first
		System.out.println(list.removeLast());
		System.out.println(list);
		Queue<Integer> q = new LinkedList<>();
//		LinkedList<Integer> q = new LinkedList<>();


	}

}
