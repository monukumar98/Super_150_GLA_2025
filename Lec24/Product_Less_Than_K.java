package Lec24;

public class Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 3, 2 };
		int k = 10;
		System.out.println(CountSubArray(arr, k));

	}

	public static int CountSubArray(int[] arr, int k) {
		int ans = 0;
		int si = 0;
		int ei = 0;
		int p = 1;
		while (ei < arr.length) {
			// grow
			p *= arr[ei];
			// shrink
			while (p >= k) {
				p /= arr[si];
				si++;
			}
			// ans calculate
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}

}
