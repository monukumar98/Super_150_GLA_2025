package Lec33;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// row
		int m = 4;// col
		PrintAnswer(n, m, 0, 0, "");

	}

	public static void PrintAnswer(int n, int m, int cc, int cr, String ans) {
		if (cc == m - 1 && cr == n - 1) {
			System.out.println(ans);
			return;
		}
		if (cc >= m || cr >= n) {
			return;
		}
		PrintAnswer(n, m, cc, cr + 1, ans + "V");
		PrintAnswer(n, m, cc + 1, cr, ans + "H");

	}

}
