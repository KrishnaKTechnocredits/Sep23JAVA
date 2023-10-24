/*WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21*/

package mohit;

public class Assignment_42 {
	void printString(String input, char ch) {
		int sum = 0;
		String output = input.substring(0, input.indexOf(ch)) + input.substring(input.lastIndexOf(ch));
		// System.out.println(output);
		for (int index = 0; index < output.length(); index++) {
			char ch1 = output.charAt(index);
			if (Character.isDigit(ch1)) {
				sum = sum + Character.getNumericValue(ch1);
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Assignment_42 assignment_42 = new Assignment_42();
		assignment_42.printString("t1ecehnoecredit983", 'e');
	}
}
