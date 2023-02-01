package Lec36;

import java.util.Scanner;

public class RatChases {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		PrintPath(maze, 0, 0, ans);
		if (f == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	static boolean f = false;

	public static void PrintPath(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			f = true;
			Display(ans);
			return;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, 1, -1 };
//		PrintPath(maze, cr - 1, cc, ans);// up
//		PrintPath(maze, cr + 1, cc, ans);// down
//		PrintPath(maze, cr, cc + 1, ans);// right
//		PrintPath(maze, cr, cc - 1, ans);// left
		for (int i = 0; i < c.length; i++) {
			PrintPath(maze, cr + r[i], cc + c[i], ans);

		}
		
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}
}
