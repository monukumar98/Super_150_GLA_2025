package Lec97;

import java.util.Scanner;

public class Day_at_the_Beach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int[] left = new int[n + 1];
		left[0] = Integer.MIN_VALUE;
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(arr[i - 1], left[i - 1]);
		}
		int[] right = new int[n + 1];
		right[n] = Integer.MAX_VALUE;
		for (int i = n - 1; i >= 0; i--) {
			right[i] = Math.min(arr[i], right[i + 1]);
		}
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (left[i] <= right[i]) {
				count++;
			}
		}
		System.out.println(count+1);
	}

}
