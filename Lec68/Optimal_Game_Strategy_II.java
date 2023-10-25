package Lec68;

public class Optimal_Game_Strategy_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 8, 4 };
		System.out.println(Optimal_Game_Strategy(arr, 0, arr.length-1));

	}

	public static int Optimal_Game_Strategy(int[] arr, int i, int j) {
		if (i > j) {
			return 0;
		}
		int f = arr[i] + Math.min(Optimal_Game_Strategy(arr, i + 2, j), Optimal_Game_Strategy(arr, i + 1, j - 1));
		int s = arr[j] + Math.min(Optimal_Game_Strategy(arr, i + 1, j - 1), Optimal_Game_Strategy(arr, i, j - 2));
		return Math.max(f, s);
	}

}
