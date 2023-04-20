package Lec50;

public class LinkedList_Cycle {
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

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void CreateCyle() throws Exception {
		Node nn = GetNode(2);
		this.tail.next = nn;
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

	public Node hasCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}

	public void CycleRemoval1() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		Node curr = head;
		while (curr != null) {
			Node temp = meet;
			while (temp.next != meet) {// cycle me move krna
				if (temp.next == curr) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			curr = curr.next;
		}

	}

	public void CycleRemoval2() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		// Cycle ka Count
		Node temp = meet;
		int count = 1;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}
		// m length aage jaayega
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = null;
	}

	public void floyedCycleRemoval() {
		Node meet = hasCycle(head);
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			fast = fast.next;
			slow = slow.next;
		}
		fast.next = null;
	}

}
