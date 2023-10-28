package Lec69;

public class Mcm {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 5, 1 };
		System.out.println(mcm(arr, 0, arr.length - 1));
	}

	public static int mcm(int[] arr, int i, int j) {
		if (i+1== j) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for (int k = i + 1; k < j; k++) {
			int fs = mcm(arr, i, k);
			int ss = mcm(arr, k, j);
			int self = arr[i] * arr[j] * arr[k];
			ans = Math.min(ans, fs + ss + self);
		}
		return ans;

	}
}
