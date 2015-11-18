public class reverseLL {
	public ListNode reverse1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode nextNode = head.next;
		ListNode newHead = reverse1(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;
	}

	public ListNode reverse2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		return prev;

		}
	

	public static void main(String[] args) {
		reverseLL result = new reverseLL();
		ListNode head = null;
		int[] array = {1,2,3,4,5};
		head = ListNode.arrayToList(array);
		ListNode.printList(head);
		ListNode newHead = result.reverse1(head);
		ListNode.printList(newHead);

		ListNode head1 = null;
		int[] array1 = {10,11,12,13,14,15};
		head1 = ListNode.arrayToList(array1);
		ListNode.printList(head1);
		ListNode newHead1 = result.reverse2(head1);
		ListNode.printList(newHead1);

	}
}
