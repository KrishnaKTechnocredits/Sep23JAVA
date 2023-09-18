/*
Assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

*/

package narendra;

public class ToFindSumOfDigitsFromString {

	void toPrintSumOfDigits(String input) {
		int sumOfDigits = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int getNumValue = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
//				sumOfDigits = sumOfDigits + Character.getNumericValue(ch);
				sumOfDigits = sumOfDigits + getNumValue;
			}
		}
		System.out.println("output is: " + sumOfDigits);

	}

	public static void main(String[] args) {
		ToFindSumOfDigitsFromString sumofdigits = new ToFindSumOfDigitsFromString();
		sumofdigits.toPrintSumOfDigits("Rah5ulTEC6Hnoc2redItS");
	}

}
