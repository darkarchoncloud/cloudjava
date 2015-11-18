public class middleNode {
	public ListNode findMiddle1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		int counter = 1;
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
			counter++;
		}

		int mid = counter / 2;
	    int ct = 0;
	    temp = head;
	    while (ct < mid) {
	    	ct++;
	    	temp = temp.next;
	    }
	    return temp;
	}

	public static void main(String[] args) {
		middleNode result = new middleNode();
		int[] array = {1,2,3,4,5,6,7};
		ListNode head = ListNode.arrayToList(array);
		ListNode.printList(head);
		ListNode mid = result.findMiddle1(head);
		ListNode.printListNode(mid);
	}
}