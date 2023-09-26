/*
Assignment-32 : 23rd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4
 
 */

package narendra;

public class Assignment32_ToDisplayUpperLowerDigit_UsingAscii {

	void printUpperLowerDigitFromString(String str) {
		int lCaseCount = 0;
		int uCaseCount = 0;
		int digitCount = 0;
		System.out.println("output is:");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch <= 90 && ch >= 65) {
				uCaseCount++;
			} else if (ch < 122 && ch >= 97) {
				lCaseCount++;
			} else if (ch <= 57 && ch >= 48) {
				digitCount++;
			}
		}
		System.out.println("Uppercase is--> " + uCaseCount);
		System.out.println("Lowercase is--> " + lCaseCount);
		System.out.println("Digit is--> " + digitCount);
	}

	public static void main(String[] args) {

		Assignment32_ToDisplayUpperLowerDigit_UsingAscii printupperlowerdigit = new Assignment32_ToDisplayUpperLowerDigit_UsingAscii();
		String input = "TeCHNoc33r44editS";
		printupperlowerdigit.printUpperLowerDigitFromString(input);
	}
}
