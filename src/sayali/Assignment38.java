/* WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0 */

package sayali;

public class Assignment38 {
	public static int sumOfDigitsInString(String str) {
		int sum = 0;
		boolean result = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			} else if ("AEIOUaeiou".indexOf(ch) != -1) {
				result = true;
			}
		}
		return result ? sum : 0;
	}

	public static void main(String[] args) {
		String str1 = "Pu1ne5Ind3ia";
		String str2 = "R1hlTns7h";
		System.out.println("Output for " + str1 + ": " + sumOfDigitsInString(str1));
		System.out.println("Output for " + str2 + ": " + sumOfDigitsInString(str2));
	}
}
