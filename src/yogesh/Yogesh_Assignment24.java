/*Assignment 24 .Write a program to print sum of all the digits within given input.
String str = "Rah5ulTEC6Hnoc2redItS";
output : 13*/

package yogesh;

public class Yogesh_Assignment24 {
	public static void main(String[] args) {
		String str = "Rah5ulTEC6Hnoc2redItS";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int x = Character.getNumericValue(ch);
				sum = sum + x;
				System.out.println("Digit is->" + x);
			}
		}
		System.out.println("================================");
		System.out.println("Sum of Digits is->" + sum);
	}
}