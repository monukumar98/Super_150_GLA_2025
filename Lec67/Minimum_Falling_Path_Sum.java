package Lec67;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(grid, 0, i));
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] grid, int cr, int cc) {
		if (cr >= grid.length || cc < 0 || cc >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		int left = Falling_Path_Sum(grid, cr + 1, cc - 1);
		int down = Falling_Path_Sum(grid, cr + 1, cc);
		int right = Falling_Path_Sum(grid, cr + 1, cc + 1);
		return Math.min(left, Math.min(right, down)) + grid[cr][cc];

	}

}
