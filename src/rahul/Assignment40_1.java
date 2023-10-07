/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeting vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr*/

package rahul;

public class Assignment40_1 {

	void subStringVowel(String input, char ch) {
		String temp = input.toLowerCase();
		int firstChar = temp.indexOf(ch);
		int lastChar = temp.lastIndexOf(ch);
		String output = temp.substring(firstChar, lastChar);
		System.out.println("Output is: " + output);
	}

	public static void main(String[] args) {
		Assignment40_1 assignment40_1 = new Assignment40_1();
		assignment40_1.subStringVowel("technocredits", 'e');
	}
}
