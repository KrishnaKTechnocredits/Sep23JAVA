package denish;

public class Assignment43 {

	void difference(String input, char ch) {
		int first = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String update1 = input.substring(first, last);
		String update2 = input.substring(0, first) + input.substring(last);
		int sum1 = 0;
		int sum2 = 0;

		for (int index = 0; index < update1.length(); index++) {
			char ch1 = update1.charAt(index);
			if (Character.isDigit(ch1)) {
				sum1 = sum1 + Character.getNumericValue(ch1);
			}
		}

		for (int index = 0; index < update2.length(); index++) {
			char c2 = update2.charAt(index);
			if (Character.isDigit(c2)) {
				sum2 = sum2 + Character.getNumericValue(c2);
			}
		}
		int total = sum2 - sum1;
		System.out.println("Answer is " + total);
	}

	public static void main(String[] args) {
		Assignment43 a = new Assignment43();
		a.difference("t1ec5ehno4e7credit983", 'e');
	}
}
