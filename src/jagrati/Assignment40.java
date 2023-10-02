/*
Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
 */

package jagrati;

public class Assignment40 {
	void repeatingChar(String input) {
		int firstIndex = input.indexOf('e');
		int lastIndex = input.lastIndexOf('e');
		String output = input.substring(firstIndex, lastIndex);
		System.out.println(
				"Given " + input + " ->string from 1st repeating vowel 'e' to last same repeating vowel 'e' -> " + output);

	}

	public static void main(String[] args) {
		Assignment40 assign = new Assignment40();
		assign.repeatingChar("technocredits");

	}
}
