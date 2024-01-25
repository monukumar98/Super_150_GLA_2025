package Lec80;

import java.util.Arrays;

public class Coins_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] c = { 0.30, 0.60, 0.80 };
		int n = c.length;
		double[][] dp = new double[n][(n + 4) / 2];
		for (double[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(P_H(c, 0, (n + 1) / 2, dp));
	}

	public static double P_H(double[] c, int i, int h, double[][] dp) {
		if (h == 0) {
			return 1;
		}
		if (i == c.length) {
			return 0;
		}
		if (dp[i][h] != -1) {
			return dp[i][h];
		}
		double ans = c[i] * P_H(c, i + 1, h - 1, dp) + (1 - c[i]) * P_H(c, i + 1, h, dp);

		return dp[i][h] = ans;
	}
}
