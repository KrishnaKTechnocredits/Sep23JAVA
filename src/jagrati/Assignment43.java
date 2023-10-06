/*
Assignment 43: 01-Oct-23
WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21
 */

package jagrati;

public class Assignment43 {
	String innerStrings = "";
	String outerStrings = "";

	void inner(String input) {
		int firstIndex = input.indexOf('e');
		int lastIndex = input.lastIndexOf('e');
		innerStrings = input.substring(firstIndex, lastIndex);
		outerStrings = input.substring(0, firstIndex) + input.substring(lastIndex);
		System.out.println("Inner String is " + innerStrings);
		System.out.println("Outer String is " + outerStrings);
	}

	void innerAndOuterSum(String input) {
		int sum1 = 0;
		int sum2 = 0;
		for (int index = 0; index < innerStrings.length(); index++) {
			char ch = innerStrings.charAt(index);
			if (Character.isDigit(ch)) {
				sum1 = sum1 + Character.getNumericValue(ch);
			}
		}
		System.out.println("Inner digit sum of " + sum1);
		for (int index = 0; index < outerStrings.length(); index++) {
			char ch = outerStrings.charAt(index);
			if (Character.isDigit(ch)) {
				sum2 = sum2 + Character.getNumericValue(ch);
			}
		}
		System.out.println("outer digit sum is " + sum2);
		if (sum1 > sum2) {
			System.out.println("Inner digit and Outer digit diffrence is " + (sum1 - sum2));
		} else if (sum2 > sum1) {
			System.out.println("Inner digit and Outer digit diffrence is " + (sum2 - sum1));
		}
	}

	public static void main(String[] args) {
		Assignment43 assign = new Assignment43();
		assign.inner("t1ec5ehno4e7credit983");
		assign.innerAndOuterSum("t1ec5ehno4e7credit983");

	}
}
