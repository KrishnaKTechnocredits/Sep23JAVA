//WAP to calculate sum of digits which are present outside of string having 1st and last repeating vowels of 'e'
//Input: t1ecehnoecredit983
//output: 21

package akshita;

public class SumNumoutsideVowels {
	int sum = 0;

	String updateString(String input) {
		String str = "";
		String str1 = "";
		String nonVov = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str + input.substring(input.indexOf(ch));
				break;
			} else {
				nonVov = nonVov + ch;
			}
		}
		for (int index1 = 0; index1 < input.length(); index1++) {
			char ch = input.charAt(index1);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str1 = str1 + input.substring(input.lastIndexOf(ch));
				break;
			}
		}
		String newString = nonVov + str1;
		return newString;
	}

	void display(String userInput) {
		System.out.println("Updated String : " + updateString(userInput));

		for (int index2 = 0; index2 < userInput.length(); index2++) {

			char ch1 = userInput.charAt(index2);
			if (Character.isDigit(ch1)) {
				sum = sum + Character.getNumericValue(ch1);
			}
		}
		System.out.println("Output: " + sum);
	}

	public static void main(String[] args) {
		SumNumoutsideVowels sum = new SumNumoutsideVowels();
		String v1 = "t1ecehnoecredit983";
		System.out.println("Input: " + v1);
		sum.updateString(v1);
		sum.display(v1);
	}
}
