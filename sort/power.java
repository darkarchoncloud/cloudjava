public class power {
	public int power(int a, int b) {
		if (b == 0) {
			return 1;
		} else if (b == 1) {
			return a;
		} 
		int half_result = power(a, b/2);
		if (b % 2 == 0) {
			return half_result * half_result;
		} else {
			return half_result * half_result * a;
		}

	}

	public static void main(String[] args) {
		power solution = new power();

		int a = 2;
		int  b = 6;
		int result = solution.power(a,b);

		System.out.println(result);
	}
}