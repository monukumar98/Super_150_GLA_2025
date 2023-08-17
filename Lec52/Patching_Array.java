package Lec52;

public class Patching_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8 };
		int n = 42;
		System.out.println(CountMissing(arr, n));

	}

	public static int CountMissing(int[] arr, int n) {
		int count = 0;
		long missing = 1;
		int i = 0;
		while (missing <= n) {
			if (i < arr.length && missing >= arr[i]) {
				missing += arr[i];
				i++;
			} else {
				missing += missing;
				count++;
			}
		}
		return count;

	}

}
