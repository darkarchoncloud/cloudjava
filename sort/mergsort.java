public class mergsort {
    public void mergeSort(int[] array) {
    	if (array == null) {
    		return;
    	}

    	int [] helper = new int[array.length];
    	mergeSort(array, helper, 0, array.length - 1);
    }

    public void copyArray(int[] source, int[] dest, int left, int right) {
    	for (int index = left; index <= right; index ++) {
    		dest[index] = source[index];
    	}
    }



	public void mergeSort(int[] array, int[] helper, int left, int right) {
          //recursion end if left >= right
		if (left >= right) {
			return;
		}
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);


	}

	public void merge(int[] array, int[] helper, int left, int mid, int right) {
		copyArray(array, helper, left, right);

		int leftIndex = left;
		int rightIndex = mid + 1;

		while (leftIndex <= mid && rightIndex <= right) {
			if (helper[leftIndex] <= helper[rightIndex]) {
				array[left++] = helper[leftIndex++];
			}
			else {
				array[left++] = helper[rightIndex++];
			}

		}

		while (leftIndex <= mid) {
			array[left++] = helper[leftIndex++];
		}
		while (rightIndex <= right) {
			array[left++] = helper[rightIndex++];
		}
	}


	public static void main(String[] args) {

		mergsort solution = new mergsort();

		int[] array = {2,1,3,4,8,-1};

		System.out.println("Here is the array before sort: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		solution.mergeSort(array);
		System.out.println();

		System.out.println("Here is the array after sort: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}


	}
}


