/*
 * Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13
Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7
 */

package subramanian;

public class Assignment_24 {

	void sumOfAllDigitsFromString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum = sum + Character.getNumericValue(input.charAt(index));
			}
		}
		System.out.println("Sum of all digits from string " + input + " is " + sum);

	}

	public static void main(String[] args) {
		Assignment_24 assignment24 = new Assignment_24();
		assignment24.sumOfAllDigitsFromString("Rah5ulTEC6Hnoc2redItS");

	}

}
