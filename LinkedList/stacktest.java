import java.util.ArrayList;


public class stacktest {

	public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<Integer>();

	list.add(1);
	list.add(0,2);
	list.add(1,3);

	list.remove(1);
	list.set(0,4);
	list.add(5);
	list.add(6);
	list.add(3);

	list.add(5);

	int pos = list.indexOf(5);
	System.out.println(pos);
	boolean yesorno = list.isEmpty();

	System.out.println(yesorno);

	int pos1 = list.lastIndexOf(5);
	System.out.println(pos1);


	System.out.println(list.size());
	int result = list.get(0);

	System.out.println(result);
	System.out.println(pos);

	System.out.println("content of the arraylist: ");

	for (int numbers : list) {
		System.out.println("Number = " + numbers);
	}
    Integer[] list1 = new Integer[list.size()];

    list1 = list.toArray(list1);

    for (Integer ele : list1) {
    	System.out.println(ele);
    }

}

}