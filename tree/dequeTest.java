import java.util.Deque;
import java.util.LinkedList;

// import java.util.*;

public class dequeTest {

	public static void main(String[] args) {
	Deque<Integer> newdeque = new LinkedList<Integer>();
	newdeque.offerLast(1);
	newdeque.offerLast(2);
	newdeque.offerFirst(3);

	// System.out.println(newdeque);

	newdeque.removeFirst();
	// System.out.println(newdeque);

	for (int i = -10; i < 0; i++) {
		newdeque.addFirst(i);
	}

	System.out.println(newdeque);

	for (int ele : newdeque) {
		System.out.println(ele + 100);
	}






}


}