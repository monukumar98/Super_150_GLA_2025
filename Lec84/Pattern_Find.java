package Lec84;

import java.util.*;


public class Pattern_Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String p = sc.next();
			Pattern(s, p);
		}

	}

	public static void Pattern(String s, String p) {
		long mod = 1000_000_007;
		long pow = 1;
		long pr = 31;
		long hv = 0;
		for (int i = 0; i < p.length(); i++) {
			int pos = p.charAt(i) - 'a' + 1;
			hv = (hv + (pos * pow) % mod) % mod;
			pow = (pow * pr) % mod;

		}
		long[] dp = new long[s.length()];
		long[] pa = new long[s.length()];
		dp[0] = s.charAt(0) - 'a' + 1;
		pa[0] = 1;
		pow = 31;
		for (int i = 1; i < s.length(); i++) {
			dp[i] = (dp[i - 1] + ((s.charAt(i) - 'a' + 1) * pow) % mod)%mod;
			pa[i] = pow;
			pow = (pow * pr) % mod;
		}
		List<Integer> ll = new ArrayList<>();
		for (int ei = p.length() - 1, si = 0; ei < s.length(); ei++, si++) {
			long curr = dp[ei];
			if (si > 0) {
				curr -= dp[si - 1];
				curr = (curr + mod) % mod;
			}
			if (curr == (hv * pa[si] % mod)) {
				ll.add(si + 1);
			}
		}

		if (ll.size() == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println(ll.size());
			for (int v : ll) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

	}

}
