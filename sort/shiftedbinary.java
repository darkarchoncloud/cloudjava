public class shiftedbinary {

	public int shiftedbinarysearch(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}

		int left = 0;
		int right = array.length - 1;

		if (array[left] == target) {
			return left;
		}
		if (array[right] == target) {
			return right;
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == array[mid]) {
				return mid;
			} else if (array[left] < array[mid]) {
				if (target > array[left] && target < array[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (target > array[mid] && target < array[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}

			} 



		}
		return -1;
	}

	public static void main(String[] args) {
		shiftedbinary solution = new shiftedbinary();
		int[] array = {7,8,9,1,2,3,4,5,6};

		int target = 6;

		System.out.println(solution.shiftedbinarysearch(array, target));


	}

}