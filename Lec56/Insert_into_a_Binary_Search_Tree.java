package Lec56;

public class Insert_into_a_Binary_Search_Tree {
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
		public TreeNode insertIntoBST(TreeNode root, int val) {
			if(root==null) {
				return new TreeNode(val);
						
			}
			if (root.val < val) {

				root.right = insertIntoBST(root.right, val);
			} else {
				root.left = insertIntoBST(root.left, val);
			}
			return root;

		}
	}
}
