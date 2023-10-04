//WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
//Input: t1ecehnoecredit983
//Output: 1+9+8+3 = 21

package pushpa;

public class Assignment42 {
	String findSubStringString(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				output = input.substring(0, input.indexOf(ch)) + input.substring(input.lastIndexOf(ch) + 1);
				break;
			}
		}
		return output;
	}

	void sumOfDigits(String input) {
		findSubStringString(input);
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		assignment42.sumOfDigits("t1ecehnoecredit983");
	}
}
