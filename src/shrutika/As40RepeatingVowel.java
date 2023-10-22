/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr */
package shrutika;

public class As40RepeatingVowel {

	void vowel(String input, char ch) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			int firstIndex = input.indexOf(ch);
			int lastIndex = input.lastIndexOf(ch);
			output = input.substring(firstIndex, lastIndex);
		}
		System.out.println(output);
		System.out.println(input.toUpperCase());
	}

	public static void main(String[] args) {
		As40RepeatingVowel repeatingVowelA40 = new As40RepeatingVowel();
		repeatingVowelA40.vowel("technocredits", 'e');
	}
}
