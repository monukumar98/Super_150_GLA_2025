package Lec47;

import java.util.Stack;

public class Maximum_Score_of_a_Good_Subarray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 7, 4, 5 };
		int k = 3;
		System.out.println(Area(arr, k));
	}

	public static int Area(int[] arr, int k) {
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (r - 1 >= k) {

					if (st.isEmpty()) {
						int a = h * r;
						ans = Math.max(ans, a);
					} else {
						int l = st.peek();
						if (l + 1 <= k) {
							int a = h * (r - l - 1);
							ans = Math.max(ans, a);
						}
					}
				}
			}

			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];

			if (st.isEmpty()) {
				int a = h * r;
				ans = Math.max(ans, a);
			} else {
				int l = st.peek();
				if (l + 1 <= k) {
					int a = h * (r - l - 1);
					ans = Math.max(ans, a);
				}
			}
		}
		return ans;

	}

}
