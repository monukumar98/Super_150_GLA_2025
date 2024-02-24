package Lec87;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static long NumberofSubArray(int[] arr) {
		long[] freq = new long[arr.length];
		long sum = 0;
		freq[0] = 1;
		for (int i = 0; i < freq.length; i++) {
			sum += arr[i];
			int idx = (int) (sum % arr.length);
			if (idx < 0) {
				idx += arr.length;
			}
			freq[idx]++;
		}
		long c = 0;
		for (int i = 0; i < freq.length; i++) {
			long p = freq[i];
			if (p >= 2) {
				c = c + (p * (p - 1)) / 2;
			}
		}
		return c;

	}
}
