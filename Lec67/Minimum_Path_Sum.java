package Lec67;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(Path_Sum(arr, 0, 0));
	}

	public static int Path_Sum(int[][] maze, int cr, int cc) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			return maze[cr][cc];

		}
		if (cr >= maze.length || cc >= maze[0].length) {
			return Integer.MAX_VALUE;
		}
		int h = Path_Sum(maze, cr, cc + 1);
		int v = Path_Sum(maze, cr + 1, cc);
		return Math.min(h, v) + maze[cr][cc];
	}

}
