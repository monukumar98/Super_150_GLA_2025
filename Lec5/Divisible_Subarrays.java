package Lec5;

public class Divisible_Subarrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		System.out.println(GoodSubArray(arr));
	}

	public static long GoodSubArray(int[] arr) {
		long sum = 0;
		int n = arr.length;
		int[] frq = new int[arr.length];
		frq[0] = 1;
		for (int i = 0; i < frq.length; i++) {
			sum = sum + arr[i];
			int idx = (int) (sum % n);
			if (idx < 0) {
				idx += n;
			}
			frq[idx] = frq[idx] + 1;

		}

		long ans = 0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] >= 2) {
				long p = frq[i];
				ans = ans + (p * (p - 1)) / 2;
			}
		}
		return ans;

	}

}
