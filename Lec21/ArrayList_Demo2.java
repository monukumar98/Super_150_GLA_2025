package Lec21;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(190);
		list.add(10);
		list.add(20);
		list.add(30);
		for (int v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int v : arr) {
			System.out.print(v + " ");
		}
	}

}
