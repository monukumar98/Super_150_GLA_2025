package Lec24;

public class Maximum_Sum_Window_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 5, 6, 7, 8, 2, 3, 9, 1, 2, 5 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));
	}

	public static int Maximum_Sum(int[] arr, int k) {
		int max = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}

		max = sum;
		for (int i = k; i < arr.length; i++) {
			sum = sum + arr[i];// window size inc hua hai
			sum = sum - arr[i - k];// window size km hua hai
			max = Math.max(max, sum);
		}
		return max;

	}

}
