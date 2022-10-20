package Lec17;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		RotateImage(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Tranpose(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;

			}

		}

	}

	public static void RotateImage(int[][] arr) {
		Tranpose(arr);
		for (int i = 0; i < arr.length; i++) {
			ReverseArray(arr[i]);

		}

	}

	public static void ReverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}

	}

}
