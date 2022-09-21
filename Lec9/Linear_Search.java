package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, -1, 7, 3, 8, 9 };
		int item = 3;
		System.out.println(Findindex(arr, item));

	}

	public static int Findindex(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
