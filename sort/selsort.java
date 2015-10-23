

public class selsort {
	public void selectionSort(int[] array) {
		//sanity check before the main logic
		if (array == null) {
			return;
		}

		for (int index = 0; index < array.length - 1; index++) {
			int minIndex = index;
			for (int tmpIndex = index + 1; tmpIndex < array.length - 1; tmpIndex ++) {
				if (array[tmpIndex] < array[minIndex]) {
					minIndex = tmpIndex;
				}
			}
			swap(array, index, minIndex);
		}
	}

	public void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static void main(String[] args) {
		selsort solution = new selsort();
        //test cases to cover all possible situations
        int [] array =  {4,1,3,2,7};

        System.out.println("This is the original list: ");

        for (int i = 0; i <= array.length - 1; i++) {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        solution.selectionSort(array);

        System.out.println("Now after selection sort, the result is: ");
        for (int j = 0; j <= array.length - 1; j++) {
        	System.out.print(array[j] + " ");
        }

        //System.out.println(Arrays.toString(array));
	}
}