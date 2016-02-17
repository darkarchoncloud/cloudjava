public class reverseSent {
	private String reverseString(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		int len = input.length();
		String result = new String(len);
		for (int i = 0; i < len; i++) {
			result.charAt(i) = input.charAt(len - i - 1);
		}
		return result;

	}

	public static void main(String[] args) {
		reverseSent solution = new reverseSent();
		String str = "I have a dream";
		String restr = solution.reverseString(str);
		System.out.println(restr);
	}
}