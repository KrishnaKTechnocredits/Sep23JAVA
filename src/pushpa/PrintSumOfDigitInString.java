//Assignment 24
//Write a program to print sum of all the digits within given input.
//String str = "Rah5ulTEC6Hnoc2redItS";
//output : 13

package pushpa;

public class PrintSumOfDigitInString {

	public void printSumOfDigitsInString(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("Sum is :" + sum);
	}

	public static void main(String[] args) {
		PrintSumOfDigitInString printSumOfDigitInString = new PrintSumOfDigitInString();
		printSumOfDigitInString.printSumOfDigitsInString("Rah5ulTEC6Hnoc2redItS");
	}

}
