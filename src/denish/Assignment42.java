package denish;

public class Assignment42 {

	int sumOfDigit(String input) {
		boolean flag;
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
				break;
			}
		}
		if (flag = true) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					int x = Character.getNumericValue(ch);
					sum = sum + x;
				}
			}
		}
		System.out.println("Sum is " + sum);
		return sum;
	}

	public static void main(String[] args) {
		Assignment42 a = new Assignment42();
		a.sumOfDigit("t1ecehnoecredit983");
	}
}
