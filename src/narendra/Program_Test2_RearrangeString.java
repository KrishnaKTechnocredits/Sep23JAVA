/*
Program 2 : Write a program to rearrange string as per below example(sumofdigits+lCase+uCase).

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS
 
 */

package narendra;

public class Program_Test2_RearrangeString {

	void toPrintStringOutput1(String input) {
		System.out.print("output using for loop is: ");
		int displaySum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int getNumValue = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				displaySum = displaySum + getNumValue;
			}
		}
		System.out.print(displaySum);

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				System.out.print(ch);
			}
		}

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				System.out.print(ch);
			}
		}

	}

	void toPrintStringOutput2(String value) {
		String lCase = "";
		String uCase = "";
		int sumOfDigit = 0;
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			if (Character.isDigit(ch)) {
				int getNumValue = Character.getNumericValue(ch);
				sumOfDigit = sumOfDigit + getNumValue;
			} 
			else if (Character.isLowerCase(ch)) {
				lCase = lCase + ch;
			} 
			else if (Character.isUpperCase(ch)) {
				uCase = uCase + ch;
			}
		}
		System.out.print("\n" + "output using nested if-else is: " + sumOfDigit + lCase + uCase);
	}

	public static void main(String[] args) {
		Program_Test2_RearrangeString sumofdigits = new Program_Test2_RearrangeString();
		sumofdigits.toPrintStringOutput1("TeCHNoc33r44editS");
		sumofdigits.toPrintStringOutput2("TeCHNoc33r44editS");
	}

}
