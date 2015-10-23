public class fibo {
	public int fibo(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n-2) + fibo(n-1);
		}
	}

	public static void main(String[] args) {
		fibo solution = new fibo();

		int n1 = solution.fibo(1);
		System.out.println(n1);
		int n2 = solution.fibo(3);
		System.out.println(n2);
        int n3 = solution.fibo(5);
		System.out.println(n3);

	}
}