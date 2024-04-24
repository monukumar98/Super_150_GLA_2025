package Lec89;

public class Binary_Tree_Cameras {
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
		public int minCameraCover(TreeNode root) {
			int c = Camera(root);
			if (c == -1) {
				count++;
			}
			return count;
		}

		int count = 0;

		public int Camera(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = Camera(root.left);
			int right = Camera(root.right);
			if (left == -1 || right == -1) {
				count++;
				return 1;
			} else if (left == 1 || right == 1) {
				return 0;
			} else {
				return -1;
			}
		}
	}

}
