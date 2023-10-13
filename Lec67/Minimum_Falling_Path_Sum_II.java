package Lec67;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(grid, 0, i));
		}
		System.out.println(ans);
	}

	private static int Falling_Path_Sum(int[][] grid, int cr, int cc) {
		// TODO Auto-generated method stub
		if (cr == grid.length - 1) {
			return grid[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, Falling_Path_Sum(grid, cr + 1, i));
			}
		}
		return ans + grid[cr][cc];

	}

}
