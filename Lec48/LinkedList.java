package Lec48;

public class LinkedList {
	public class Node {
		int val;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

//O(1)
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = head;
			head = nn;
			this.size++;
		}

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}

//
	public void AddLast(int item) {
		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol k range me dedo");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void AddatIndex(int item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("Bklol k range me dedo");
		}
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			AddLast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = nn;
			nn.next = kth;
			size++;
		}
	}

	public int getFirst() {

		return head.val;
	}

	public int getLast() {

		return tail.val;
	}

	public int getatIndex(int k) throws Exception {
		return GetNode(k).val;
	}

	public int removeFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Bklol LinkedList Empty hai");
		}
		int rv = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return rv;
	}

	public int removeLast() throws Exception {
		if (size == 0) {
			throw new Exception("Bklol LinkedList Empty hai");
		}
		if (size == 1) {
			return removeFirst();
		} else {
			int rv = tail.val;
			Node n = GetNode(size - 2);
			tail = n;
			tail.next = null;
			size--;
			return rv;
		}
	}

	public int removeatIndex(int k) throws Exception {
		if (size == 0) {
			throw new Exception("Bklol LinkedList Empty hai");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {
			Node k_1th = GetNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.val;

		}
	}

}
