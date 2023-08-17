package Lec53;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
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

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.data + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.data, Math.max(left, right));

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}

		if (nn.data == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return -1;// single node ki height 0 aayega
			// single node ki height 1 aayega return 0 pe
		}

		int lh = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(lh, rh) + 1;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.data + " ");
		INOrder(node.right);

	}

	public void levelOrder() {
		// LinkedList<Node> queue = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();// remove first q.poll();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
		System.out.println();
	}

}
