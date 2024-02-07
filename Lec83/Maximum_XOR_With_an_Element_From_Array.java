package Lec83;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_XOR_With_an_Element_From_Array {
	static class Node {
		Node zero;
		Node one;
	}

	public static void add(Node root, int val) {
		Node curr = root;

		for (int i = 31; i >= 0; i--) {
			int bit = (val & (1 << i));
			if (bit == 0) {
				if (curr.zero != null) {
					curr = curr.zero;
				} else {
					Node nn = new Node();
					curr.zero = nn;
					curr = nn;
				}
			} else {
				if (curr.one != null) {
					curr = curr.one;
				} else {
					Node nn = new Node();
					curr.one = nn;
					curr = nn;
				}
			}
		}

	}

	private static int getxor(Node root, int val) {
		// TODO Auto-generated method stub
		Node curr = root;
		int xor = 0;
		for (int i = 31; i >= 0; i--) {
			int bit = (val & (1 << i));
			if (bit == 0) {
				if (curr.one != null) {
					xor += (1 << i);
					curr = curr.one;
				} else {
					curr = curr.zero;
				}
			} else {
				if (curr.zero != null) {
					xor += (1 << i);
					curr = curr.zero;
				} else {
					curr = curr.one;
				}
			}
		}
		return xor;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 6, 6, 3 };
		Arrays.sort(arr);
		int[][] queries = { { 12, 4 }, { 8, 1 }, { 6, 3 } };
		Pair[] p = new Pair[queries.length];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Pair(queries[i][0], queries[i][1], i);
		}
		Arrays.sort(p, new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.mi - o2.mi;
			}
		});
		int[] ans = new int[p.length];
		int j = 0;
		Node root = new Node();
		for (Pair x : p) {
			while (j < arr.length && arr[j] <= x.mi) {
				add(root, arr[j]);
				j++;
			}
			if (j == 0) {
				ans[x.i] = -1;
			} else {
				ans[x.i] = getxor(root, x.xi);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	static class Pair {
		int xi, mi, i;

		public Pair(int xi, int mi, int i) {
			// TODO Auto-generated constructor stub
			this.xi = xi;
			this.mi = mi;
			this.i = i;

		}
	}
}
