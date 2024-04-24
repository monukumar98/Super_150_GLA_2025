package Lec89;

public class Distribute_Coins {
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
		int count = 0;

		public int distributeCoins(TreeNode root) {
			Move(root);
			return count;
		}

		public int Move(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = Move(root.left);
			int right = Move(root.right);
			count = count + Math.abs(left) + Math.abs(right);
			return left + right + root.val - 1;

		}
	}

}
