public class bisearch {
	public int bisearch(int[] array, int size, int target) {
		if (array == null) {

			return -1;
		}

		int left = 0;
		int right = size - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target == array[mid]) {
				return mid;
			}
			if (target < array[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;




	}

	public static void main(String[] args) {
		bisearch solution = new bisearch();
		int[] array = {1,2,4,5,7,8,10};

		int target = 6;

		int result = solution.bisearch(array, array.length, target);

		System.out.println(result);

	}
}