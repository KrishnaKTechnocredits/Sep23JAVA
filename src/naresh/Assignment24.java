package naresh;
/* Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13

Hint : Character.getNumericValue(str.charAt(index)); '7' -> 7 */

public class Assignment24 {

	void sumOfDigit(String input) {
		int num = 0;
		int sum=0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				num = Character.getNumericValue(input.charAt(index));
				sum = sum + num;
			}
		}
		System.out.println("sum of digits in the string ->"+sum);
	}

	public static void main(String[] args) {
		Assignment24 a = new Assignment24();
		a.sumOfDigit("Rah5ulTEC6Hnoc2redItS");
	}
}
