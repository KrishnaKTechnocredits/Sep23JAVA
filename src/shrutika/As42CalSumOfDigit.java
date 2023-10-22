/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21 */
package shrutika;

public class As42CalSumOfDigit {

	void sumOfDigit(String input) {
		int sum = 0;
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int firstIndex = input.indexOf(ch);
				int lastIndex = input.lastIndexOf(ch);
				output = input.substring(0, firstIndex) + input.substring(lastIndex);
				System.out.println(output);
				break;
			}
		}
		for (int innerIndex = 0; innerIndex < output.length(); innerIndex++) {
			char cha = output.charAt(innerIndex);
			if (Character.isDigit(cha)) {
				sum = sum + Character.getNumericValue(cha);
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		As42CalSumOfDigit calSumOfDigitA42 = new As42CalSumOfDigit();
		calSumOfDigitA42.sumOfDigit("t1ecehnoecredit983");
	}
}
