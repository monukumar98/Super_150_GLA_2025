package Lec54;

public class OPti_Diameter_of_Binary_Tree {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dia;
		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			int sd = ldp.ht + rdp.ht + 2;
			DiaPair sdp = new DiaPair();
			sdp.dia = Math.max(sd, Math.max(rdp.dia, ldp.dia));
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			return sdp;
		}
	}

	class DiaPair {
		int dia = 0;
		int ht = -1;
	}
}
