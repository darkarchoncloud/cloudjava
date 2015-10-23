public class quicksort {

	private int pivotPos(int left, int right) {
		return left + (int) (Math.random() * (right - left + 1));
	}

    public void swap(int[] array, int left, int right) {
    	int temp = array[left];
    	array[left] = array[right];
    	array[right] = temp;
    }

    private int partition(int[] array, int left, int right) {
    	int pivotPos = pivotPos(left, right);
    	int pivotValue = array[pivotPos];

    	//swap the pivot element to the rightmost position

    	swap(array, pivotPos, right);
    	int leftBound = left;
    	int rightBound = right - 1;
        while (leftBound <= rightBound) {
        	if (array[leftBound] < pivotValue) {
        		leftBound++;
        	} else {
        		swap(array, leftBound, rightBound--);
        	}
        }

        swap(array, leftBound, right);
        return leftBound;


    }

    public void quickSort(int[] array, int left, int right) {
    	if (left >= right) {
    		return;
    	}
    	int pivotPos = partition(array, left, right);
    	quickSort(array, left, pivotPos - 1);
    	quickSort(array, pivotPos + 1, right);
    }

    public void quickSort(int[] array) {
    	if (array == null) {
    		return;
    	}

    	quickSort(array, 0, array.length - 1);
    }


    public static void main(String[] args) {
    	quicksort solution = new quicksort();
    	int[] array = {1,3,2,6,4,7, -1, -10, 23,89};

    	System.out.println("Here is the array before sorting: ");
    	for (int i = 0; i < array.length; i++) {
    		System.out.print(array[i] + " ");

    	}

    	solution.quickSort(array);
    	System.out.println();
    	System.out.println("Here is the array after sorting: ");
    	for (int j = 0; j < array.length; j++) {
    		System.out.print(array[j] + " ");
    	}

    }





}