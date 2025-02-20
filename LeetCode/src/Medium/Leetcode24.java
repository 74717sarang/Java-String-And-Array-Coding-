package Medium;

public class Leetcode24 {

//	24. Swap Nodes in Pairs
//	  Definition for singly-linked list.
	class ListNode {
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

	public ListNode swapPairs(ListNode head) {

		if (head == null)
			return null;
		ListNode temp = head;
		while (temp != null && temp.next != null) {
			int t = temp.val;
			temp.val = temp.next.val;
			temp.next.val = t;

			temp = temp.next.next;
		}
		return head;
	}

	public static void main(String[] args) {

//		24. Swap Nodes in Pairs

//	   Input: head = [1,2,3,4]

//				Output: [2,1,4,3]

	}

}
