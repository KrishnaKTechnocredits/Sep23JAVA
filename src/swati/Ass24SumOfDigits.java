/*Assignment - 24 : 16th Sep
'2023 Write a program to print sum of all the digits within given input. 
String str = "Rah5ulTEC6Hnoc2redItS"; 
output : 13 Hint : 
Character.getNumericValue(str.charAt(index)); '7' -> 7*/

package swati;

public class Ass24SumOfDigits {

	void sumOfDigits(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				count = count + Character.getNumericValue(ch);
		}
		System.out.println("Sum of digits in given string is = " + count);
	}

	public static void main(String[] args) {
		new Ass24SumOfDigits().sumOfDigits("Rah5ulTEC6Hnoc2redItS");
	}
}
