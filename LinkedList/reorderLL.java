public class reorderLL {


	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nextNode = head.next;
		ListNode newHead = reverseList(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;
	}

	public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;
		while (head1 != null && head2 != null) {
			current.next = head1;
			head1 = head1.next;
			current = current.next;
			current.next = head2;
			head2 = head2.next;
			current = current.next;
		}

		if (head1 == null) {
			while (head2 != null) {
			current.next = head2;
			head2 = head2.next;
			current = current.next;
		}
		}

		if (head2 == null) {
			while (head1 != null) {
				current.next = head1;
				head1 = head1.next;
				current = current.next;
			}
		}

		current.next = null;
		return dummyHead.next;
	}
	public ListNode reorderLinkedList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode middle = middleNode(head);
		ListNode reverseHead = reverseList(middle.next);
		middle.next = null;
		ListNode reorderHead = mergeTwoLists(head, reverseHead);

		return reorderHead;







	}

	public static void main(String[] args) {
		reorderLL result = new reorderLL();
		ListNode head = ListNode.arrayToList(new int[] {1,2,3,4});
		ListNode.printList(head);

		ListNode newHead = result.reorderLinkedList(head);
		ListNode.printList(newHead);
	}
}