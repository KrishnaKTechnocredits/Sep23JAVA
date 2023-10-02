/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21
*/

package deepak;

class Assignment42_Substring3 {
	char vowel;

	char getVowel(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel = ch;
				break;
			}
		}
		return vowel;
	}

	int getDigitSum(String input) {
		int sum1 = 0;
		int sum2 = 0;
		int totalSum = 0;
		System.out.println("Input: " + input);
		char vowel = getVowel(input);
		String string1 = "";
		String string2 = "";
		string1 = string1 + input.substring(0, input.indexOf(vowel));
		string2 = string2 + input.substring(input.lastIndexOf(vowel), input.length());

		for (int index = 0; index < string1.length(); index++) {
			char ch = string1.charAt(index);
			if (Character.isDigit(ch)) {
				sum1 = sum1 + Character.getNumericValue(ch);
			}
		}

		for (int index = 0; index < string2.length(); index++) {
			char ch = string2.charAt(index);
			if (Character.isDigit(ch)) {
				sum2 = sum2 + Character.getNumericValue(ch);
			}
		}
		totalSum = sum1 + sum2;
		return totalSum;
	}

	public static void main(String[] args) {
		Assignment42_Substring3 string = new Assignment42_Substring3();
		System.out.println("Sum of digits which are present outside of the string(first place of 1st vowel and last place of 1st vowel)");
		System.out.println("Output: "+string.getDigitSum("t1ecehnoecredit983"));
	}
}