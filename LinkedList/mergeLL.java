public class mergeLL {
	public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
		if (head1 == null && head2 == null) {
			return null;
		} else if (head1 == null) {
			return head2;
		} else if (head2 == null) {
			return head1;
		} 
			ListNode dummyHead = new ListNode(0);
			ListNode curr = dummyHead;
			ListNode curr1 = head1;
			ListNode curr2 = head2;
			while (curr1 != null && curr2 != null) {
				if (curr1.value < curr2.value) {
					curr.next = curr1;
					curr1 = curr1.next;
					curr = curr.next;

				} else if (curr1.value > curr2.value) {
					curr.next = curr2;
					curr2 = curr2.next;
					curr = curr.next;
				}

			}

			while (curr1 != null) {
				curr.next = curr1;
				curr1 = curr1.next;
				curr = curr.next;
			}
			while (curr2 != null) {
				curr.next = curr2;
				curr2 = curr2.next;
				curr = curr.next;
			}

			curr.next = null;
		

		
		return dummyHead.next;

	}

	public static void main(String[] args) {

		mergeLL result = new mergeLL();

		ListNode head1 = ListNode.arrayToList(new int[] {1,3,5,7,9});
		ListNode head2 = ListNode.arrayToList(new int[] {2,4,6,8,10});

		ListNode.printList(head1);
		ListNode.printList(head2);

		System.out.println("Here is the combined list: ");

		ListNode newHead = result.mergeTwoLists(head1, head2);

		ListNode.printList(newHead);


	}
}