import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class test {

	static int a = 10;
	public static void main(String[] args) {
		// int[] array = null;
		// int value = array[0];
		// System.out.println(value);

		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());

		list.add(1);
		System.out.println(list.size());

		list.add(0,2);
		System.out.println(list.size());

		list.add(1,3);
		System.out.println(list.get(1));
		list.remove(1);
		list.set(0,4);
		System.out.println(list);

		for (int i = 10; i <= 20; i++) {
			list.add(i);
		}

		System.out.println(list);
		System.out.println(list.size());
		//System.out.println(list.capacity());

		for (int i = 0; i < 5; i++) {
			list.remove(list.size() - 1);


		}

		System.out.println(list);
		System.out.println(a);

		List<Integer> list1 = new LinkedList<Integer>();
		System.out.println(list1.size());

		String mystr = "anqi shao";

	 char r = mystr.charAt(0);

	    System.out.println(r);
	}
}