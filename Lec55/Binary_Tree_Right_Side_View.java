package Lec55;

import java.util.*;

public class Binary_Tree_Right_Side_View {
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
		int maxdept = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightiew(root, 1, ll);
			return ll;
		}

		public void rightiew(TreeNode root, int currlevel, List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (maxdept < currlevel) {
				ll.add(root.val);
				maxdept = currlevel;
			}
			rightiew(root.right, currlevel + 1, ll);
			rightiew(root.left, currlevel + 1, ll);

		}
	}
}
