public class binaryvariant {
	public int firstoccur(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;

		}
		int left = 0;
		int right = array.length - 1;

		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (target == array[mid]) {
				right = mid;
			}
			else if (target < array[mid]) {
				right = mid;
			}
			else {
				left = mid;
			}

		}

		if (target == array[left]) {
			return left;
		}

		if (target == array[right]) {
			return right;
		} 

		return -1;

		



	}

	public int lastoccur(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;

		}
		int left = 0;
		int right = array.length - 1;

		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (target == array[mid]) {
				left = mid;
			}
			else if (target < array[mid]) {
				right = mid;
			}
			else {
				left = mid;
			}

		}
		if (target == array[right]) {
			return right;
		} 

		if (target == array[left]) {
			return left;
		}

		

		return -1;

	}

	public int closest(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;

		}

		if (target < array[0]) {
			return 0;
		} else if (target > array[array.length - 1]) {
			return array.length - 1;
		}
		int left = 0;
		int right = array.length - 1;

		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (target == array[mid]) {
				return mid;
			}
			else if (target < array[mid]) {
				right = mid;
			}
			else {
				left = mid;
			}

		}
		int dis1 = Math.abs(target - array[left]);
		int dis2 = Math.abs(target - array[right]);

		if (dis1 < dis2) {
			return left;
		} else {
			return right;
		}

		


	}



	public static void main(String[] args) {
		binaryvariant solution = new binaryvariant();
		int[] array = {4,5,5,5,5,6,10};

		int target = 9;
		

		int result = solution.firstoccur(array, target);

		int result2 = solution.lastoccur(array, target);

		int result3 = solution.closest(array, target);

		System.out.println("The fist occurence of the target element is at: ");

		System.out.println(result);

		System.out.println("The last occurence of the target element is at: ");

		System.out.println(result2);

		System.out.println("The closest element to the target element is: ");

		System.out.println(result3);
	}
}