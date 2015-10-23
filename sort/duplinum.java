public class duplinum {
	public int dupNum(int[] array, int left, int right, int target) {
		if (array == null || array.length == 0) {
			return 0;
		}


		int mid = left + (right - left) / 2;


		if (left == right || mid == 0) {
			if (array[left] == target) {
				return 1;
			} else {
				return 0;
			}
		}

		if (left == right - 1) {
			if ((target == array[left]) && (target == array[right])) {
				return 2;
			} else {
				if (target == array[left] || target == array[right]) {
					return 1;
				} else {
					return 0;
				}
			}

		}

		if (target == array[mid]) {
			return dupNum(array, left, mid - 1, target) + dupNum(array, mid + 1, right, target) + 1;

		} else if (target < array[mid]) {
			return dupNum(array, left, mid - 1, target);
		} else {
			return dupNum(array, mid + 1, right, target);
		}
	}

	public static void main(String[] args) {
         duplinum solution = new duplinum();
         int[] array = {1,1,1,1,2,3,3,4,5,5,5,6,7};
         int target = 7;

         int result = solution.dupNum(array, 0, array.length - 1, target);

         System.out.println(result);


	}

}


