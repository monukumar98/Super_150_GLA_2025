package Lec79;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		System.out.println(Count(c, l, r, x));
		

	}

	public static long Count(int[] c, int l, int r, int x) {
		int n = c.length;
		int ans = 0;
		for (int i = 3; i < (1 << n); i++) {
			if (FastCount(i) >= 2 && isitpossible(c, i, l, r, x)) {
				ans++;
			}
		}
		return ans;
	}
	private static boolean isitpossible(int[] c, int i, int l, int r, int x) {
		long sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int pos = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				sum = sum + c[pos];
				min = Math.min(min, c[pos]);
				max = Math.max(max, c[pos]);
			}
			pos++;
			i >>= 1;
		}

		return sum >= l & sum <= r & max - min >= x;
	}

	public static int FastCount(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n - 1));
			count++;
		}
		return count;
	}
}
