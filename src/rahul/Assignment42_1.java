/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeting vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21*/

package rahul;

public class Assignment42_1 {

	String splitString(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int first = input.indexOf(ch);
			int last = input.lastIndexOf(ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				temp = input.substring(0, first) + input.substring(last + 1, input.length());
				break;
			}
		}
		System.out.println("Substring: " + temp);
		return temp;
	}

	void sumOfDigits(String str) {
		String output = splitString(str);
		int sum = 0;
		for (int index = 0; index < output.length(); index++) {
			char ch = output.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Assignment42_1 assignment42_1 = new Assignment42_1();
		assignment42_1.sumOfDigits("t1ecehnoecredit983");
	}
}
