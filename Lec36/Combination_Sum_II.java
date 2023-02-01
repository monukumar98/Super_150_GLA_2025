package Lec36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(coin);
		Combination(coin, target, ll, 0, ans);
		System.out.println(ans);

	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			ans.add(new ArrayList<>(ll));

			return;

		}
		for (int i = idx; i < coin.length; i++) {
			if(i==idx || coin[i]!=coin[i-1]) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i + 1, ans);
				ll.remove(ll.size() - 1);
			}
			}
		}

	}

}
