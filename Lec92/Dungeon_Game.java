package Lec92;

import java.util.Arrays;

public class Dungeon_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for (int[] a1 : dp) {
			Arrays.fill(a1, -1);
		}
		System.out.println(calculateMinimum(arr, 0, 0, dp));

	}

	public static int calculateMinimum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cr == arr.length || cc == arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		if (cr == arr.length - 1 && cc == arr[0].length - 1) {
			return arr[cr][cc] > 0 ? 1 : 1 - arr[cr][cc];
		}
		int left = calculateMinimum(arr, cr, cc + 1, dp);
		int right = calculateMinimum(arr, cr + 1, cc, dp);
		int p = Math.min(left, right) - arr[cr][cc];

		return dp[cr][cc] = p > 0 ? p : 1;

	}

}
