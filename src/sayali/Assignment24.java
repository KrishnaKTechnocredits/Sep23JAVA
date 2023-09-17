/*Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

package sayali;

public class Assignment24 {

	void printSum(String input) {
		
		int num = 0;
		int sum=0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				num = Character.getNumericValue(input.charAt(index));
				sum = sum + num;
			}
		}
		System.out.println("Sum of all the digits in the string ->" +sum);
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		assignment24.printSum("Rah5ulTEC6Hnoc2redItS");
	}
}