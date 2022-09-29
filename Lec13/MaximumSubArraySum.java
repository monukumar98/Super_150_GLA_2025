package Lec13;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -5, -6, -5, -7 };
		System.out.println(maxsum(arr));

	}

	public static int maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;//-2^31
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(sum, ans);

			}
		}
		return ans;

	}

}
