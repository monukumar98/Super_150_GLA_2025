package Lec49;

public class Merge_Two_Sorted_Lists {
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
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode a = list1;
			ListNode b = list2;
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (a != null && b != null) {
				if (a.val < b.val) {
					Dummy.next = a;
					Dummy = Dummy.next;
					a = a.next;
				} else {
					Dummy.next = b;
					Dummy = Dummy.next;
					b = b.next;
				}
			}
			if (a != null) {
				Dummy.next = a;
			}
			if (b != null) {
				Dummy.next = b;
			}
			return temp.next;

		}
	}

}
