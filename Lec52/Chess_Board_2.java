package Lec52;

import java.util.Scanner;

public class Chess_Board_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] minpot = mines_and_ports(n);
		System.out.println("\n" + PrintPath(n - 1, n - 1, 0, 0, "", minpot));
	}

	public static int PrintPath(int er, int ec, int cr, int cc, String ans, int[] minpot) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int val = cr * (er + 1) + (cc + 1);
		if (minpot[val] == 1) {
			return 0;
		}
		int count = 0;
		if (minpot[val] == 2) {
			count += PrintPath(er, ec, er, ec, ans + "{" + cr + "-" + cc + "}P", minpot);
		}

		// knight
		count += PrintPath(er, ec, cr + 2, cc + 1, ans + "{" + cr + "-" + cc + "}K", minpot);
		count += PrintPath(er, ec, cr + 1, cc + 2, ans + "{" + cr + "-" + cc + "}K", minpot);

		// rook
		if (cr == 0 || cc == 0 || cc == ec || cr == er) {
			for (int i = 1; i <= ec; i++) {
				count += PrintPath(er, ec, cr, cc + i, ans + "{" + cr + "-" + cc + "}R", minpot);
			}
			for (int i = 1; i <= er; i++) {
				count += PrintPath(er, ec, cr + i, cc, ans + "{" + cr + "-" + cc + "}R", minpot);
			}

		}
		// bishop
		if (cr == cc || cr + cc == ec) {
			for (int i = 1; i <= er; i++) {
				count += PrintPath(er, ec, cr + i, cc + i, ans + "{" + cr + "-" + cc + "}B", minpot);
			}
		}
		return count;

	}

	public static int[] mines_and_ports(int n) {
		int[] minpot = new int[(n * n) + 1];
		boolean[] prime = Prime(n);
		int count = 1;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				if (count % 2 != 0) {
					minpot[i] = 1;// mine
				} else {
					minpot[i] = 2;// port
				}
				count++;
			}
		}
		return minpot;

	}

	public static boolean[] Prime(int n) {
		boolean[] ans = new boolean[(n * n) + 1];
		ans[0] = ans[1] = true;
		for (int i = 2; i < ans.length; i++) {
			if (ans[i] == false) {
				for (int j = 2; j * i < ans.length; j++) {
					ans[i * j] = true;
				}
			}
		}
		return ans;

	}
}
