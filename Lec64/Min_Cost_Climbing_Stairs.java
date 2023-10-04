package Lec64;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zeroth = Min_Cost(arr, 0);
		int first = Min_Cost(arr, 1);
		System.out.println(Math.min(first, zeroth));
	}

	public static int Min_Cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int first = Min_Cost(arr, i + 1);
		int sec = Min_Cost(arr, i + 2);
		return Math.min(sec, first) + arr[i];

	}

}
