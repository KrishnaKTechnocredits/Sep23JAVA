/*Assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

package rahul;

public class Assignment24_1 {

	void sumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				char ch = input.charAt(index);
				int value = Character.getNumericValue(ch);
				sum = sum + value;
			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Assignment24_1 assignment24_1 = new Assignment24_1();
		assignment24_1.sumOfDigits("Rah5ulTEC6Hnoc2redItS");
	}
}
