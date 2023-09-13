package Lec59;

public class LinkedList<T> {
	public class Node {
		T val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	public void addFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(T item) {
		if (size == 0) {
			addFirst(item);

		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public void addatindex(T item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("Rajat bklol k wala index glt hai  ");
		}
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node k_1 = getNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1.next;
			k_1.next = nn;
			size++;
		}

	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public T getfirst() {
		return head.val;
	}

	public T getlast() {
		return tail.val;
	}

	public T getatindex(int k) {
		return getNode(k).val;
	}

	public T removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;

	}

	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			Node sn = getNode(size - 2);
			Node temp = tail;
			tail = sn;
			tail.next = null;
			size--;
			return temp.val;
		}

	}

	public T removeatindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = getNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;

		}
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addLast("Raj");
		ll.addLast("Ankit");
		ll.addLast("Kunal");
		ll.addLast("Amisha");
		ll.addLast("Puneet");
		ll.addLast("Pooja");
		ll.Display();
	}
}
