/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0 */
package shrutika;

public class As38SumofDigit {

	boolean getVowels(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
				break;
			}
		}
		return (flag);
	}

	void sumOfDigit(String input) {
		boolean flag = getVowels(input);
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (flag == true) {
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			} else {
				sum = 0;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		As38SumofDigit sumofDigitA38 = new As38SumofDigit();
		String input = "Pu1ne5Ind3ia";
		boolean output = sumofDigitA38.getVowels(input);
		System.out.println(output);
		sumofDigitA38.sumOfDigit("Pu1ne5Ind3ia");
		input = "R1hlTns7h";
		output = sumofDigitA38.getVowels(input);
		System.out.println(output);
		sumofDigitA38.sumOfDigit("R1hlTns7h");
	}
}
