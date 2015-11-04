public class ListNode {
	public int value;
	public ListNode next;

	public ListNode(int value) {
		this.value = value;
	}

	//Utility method to convert an int array to single linked list

	public static ListNode arrayToList(int[] array) {
		if (array == null || array.length == 0) {
			return null;
		}
		ListNode head = new ListNode(array[0]);

		ListNode current = head;

		for (int index = 1; index < array.length; index++) {
			current.next = new ListNode(array[index]);
			current = current.next;
		}
		return head;
	}

	/*Utility method to convert an int array to single linked list 
	with circle starts at preLength */
    public static ListNode arrayToListWithCircle(int[] array, int preLength) {
    	if (array == null || array.length == 0) {
    		return null;
    	}

    	ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
    	ListNode current = dummyHead;
    	ListNode circleStart = null;

    	for (int index = 0; index < array.length; index++) {
    		current.next = new ListNode(array[index]);
    		current = current.next;
    		if (index == preLength) {
    			//remember the position where the circle starts
    			circleStart = current;
    		}
    	}
    	current.next = circleStart;
    	return dummyHead.next;
    }

    //Utility method to print out a singled linked list

    public static void printList(ListNode head) {
    	StringBuilder builder = new StringBuilder();
    	while (head != null) {
    		builder.append(head.value).append("->");
    		head = head.next;
    	}

    	builder.append("null");

    	System.out.println(builder.toString());

    }

    //Utility method to print out a node in linked list.

    public static void printListNode(ListNode node) {
    	if (node == null) {
    		System.out.println("null");

    	} else {
    		System.out.println("[ " + node.value + " ]");
    	}
    }

    public static void main(String[] args) {
    	ListNode solution = new ListNode(0);
    	int[] array = {1,2,3,4,5,6,7};
    	ListNode head = null;
    	head = solution.arrayToList(array);
    	solution.printList(head);


    }













}