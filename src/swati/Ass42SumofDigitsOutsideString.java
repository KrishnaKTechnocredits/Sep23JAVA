/*Assignment 42: 01-Oct-23 WAP to calculate sum of digits which are present outside
of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983 
Output: 1+9+8+3 = 21*/
package swati;

public class Ass42SumofDigitsOutsideString {

	String returnNewString(String input) {
		String newstring = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				int firstindex = input.indexOf(ch);
				int lastindex = input.lastIndexOf(ch);
				newstring = input.substring(0, firstindex) + input.substring(lastindex);
				break;
			}
		}
		return newstring;
	}

	void calculateSum(String input) {
		String newinput = returnNewString(input);
		int sum = 0;
		for (int index = 0; index < newinput.length(); index++) {
			char ch = newinput.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits from given string is ->" + sum);
	}

	public static void main(String[] args) {
		new Ass42SumofDigitsOutsideString().calculateSum("t1ecehnoecredit983");
	}
}
