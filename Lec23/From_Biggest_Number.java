package Lec23;

public class From_Biggest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 54, 546, 548, 60 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Sort(int[] arr) {
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length - pass; i++) {
				if (campare(arr[i], arr[i + 1]) > 0) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i+1] = temp;
				}
			}
		}
	}

	public static long campare(int x, int y) {
		// TODO Auto-generated method stub
		String xy = "" + x + y;
		String yx = "" + y + x;
		return Long.parseLong(yx) - Long.parseLong(xy);
	}
}
