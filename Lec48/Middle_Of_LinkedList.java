package Lec48;

public class Middle_Of_LinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null&& fast.next.next != null ) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;

		}
	}

}
