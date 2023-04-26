package Lec52;

import java.util.Scanner;

public class Chessboard_problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("\n" + PrintPath(n - 1, n - 1, 0, 0, ""));
	}

	public static int PrintPath(int er, int ec, int cr, int cc, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		// knight
		count += PrintPath(er, ec, cr + 2, cc + 1, ans + "{" + cr + "-" + cc + "}K");
		count += PrintPath(er, ec, cr + 1, cc + 2, ans + "{" + cr + "-" + cc + "}K");

		// rook
		if (cr == 0 || cc == 0 || cc == ec || cr == er) {
			for (int i = 1; i <= ec; i++) {
				count += PrintPath(er, ec, cr, cc + i, ans + "{" + cr + "-" + cc + "}R");
			}
			for (int i = 1; i <= er; i++) {
				count += PrintPath(er, ec, cr + i, cc, ans + "{" + cr + "-" + cc + "}R");
			}
			

		}
		// bishop
		if (cr == cc || cr + cc == ec) {
			for (int i = 1; i <= er; i++) {
				count += PrintPath(er, ec, cr + i, cc + i, ans + "{" + cr + "-" + cc + "}B");
			}
		}
		return count;

	}
}
