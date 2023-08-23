package Lec56;

import java.util.*;

public class Level_Order_Traversal {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Level_Order_Traversal() {
		// TODO Auto-generated constructor stub
		root = createtree();
	}

	Scanner sc = new Scanner(System.in);

	private Node createtree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = createtree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = createtree();
		}
		return nn;
	}

	public void levelOrder() {
		// LinkedList<Node> queue = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		Queue<Node> hlp = new LinkedList<>();
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();// remove first q.poll();
			// System.out.print(rv.data + " ");
			ll.add(rv.data);
			if (rv.left != null) {
				hlp.add(rv.left);
			}
			if (rv.right != null) {
				hlp.add(rv.right);
			}
			if (q.isEmpty()) {
				q = hlp;
				hlp = new LinkedList<>();
				ans.add(ll);
				ll = new ArrayList<>();

			}
			

		}
		System.out.println(ans);
		System.out.println();
	}

	public static void main(String[] args) {
		Level_Order_Traversal lv = new Level_Order_Traversal();
		lv.levelOrder();

	}

}
