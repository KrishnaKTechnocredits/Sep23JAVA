/*assignment - 24 : 16th Sep'2023

Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13	*/

package mohit;

public class Assignment_24 {
	void printSumOfAllDigits(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));

		}
		System.out.println("The sum of all the digits in " + str + " is " + sum);

	}

	public static void main(String[] args) {
		Assignment_24 assignment_24 = new Assignment_24();
		assignment_24.printSumOfAllDigits("Rah5ulTEC6Hnoc2redItS");
	}

}
