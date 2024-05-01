package Lec93;

import java.util.HashMap;

public class House_Robber_III {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		HashMap<TreeNode, Integer> dp = new HashMap<>();
		public int rob(TreeNode root) {
			
			if (root == null) {
				return 0;
			}
			if(dp.containsKey(root)) {
				return dp.get(root);
			}
			// rob
			int ans1 = root.val;
			if (root.left != null) {
				ans1 = ans1 + rob(root.left.left) + rob(root.left.right);
			}
			if (root.right != null) {
				ans1 = ans1 + rob(root.right.left) + rob(root.right.right);
			}
			// dont rob
			int ans2 = rob(root.left) + rob(root.right);
			dp.put(root, Math.max(ans1, ans2));
			return Math.max(ans1, ans2);

		}
	}
}
