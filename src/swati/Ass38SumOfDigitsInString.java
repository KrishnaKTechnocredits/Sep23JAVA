/*Assignment 38: 01st Oct 2023 WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9 
String str = "R1hlTns7h"; output : 0*/

package swati;

public class Ass38SumOfDigitsInString {

	boolean containsVowel(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				flag = true;
				break;
			}
		}
		return flag;
	}

	void calculateSum(String input) {
		int sum = 0;
		boolean f = containsVowel(input);
		if (f) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("Sum of digits in given String " + input + " is ->" + sum);
	}

	public static void main(String[] args) {
		Ass38SumOfDigitsInString ass38SumOfDigitsInString = new Ass38SumOfDigitsInString();
		ass38SumOfDigitsInString.calculateSum("Pu1ne5Ind3ia");
		ass38SumOfDigitsInString.calculateSum("RU1hlTns7h");

	}

}
