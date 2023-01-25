package Lec34;

import java.util.*;

public class Create_Level_Order {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public Create_Level_Order() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		Node nn = new Node();
		int val = sc.nextInt();// 10
		nn.val = val;
		root = nn;
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);

			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rv.right = node;
				q.add(node);

			}
		}
		return root;
	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public static void main(String[] args) {
		Create_Level_Order cl = new Create_Level_Order();
		cl.PreOrder();
	}
}
