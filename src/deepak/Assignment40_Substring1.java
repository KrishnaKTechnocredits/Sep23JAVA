/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
*/
package deepak;

public class Assignment40_Substring1 {
	char tempCh;
	String output ="";

	String getSubstring(String input) {
		System.out.println("Input: " + input);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				tempCh = ch;
				break;
			}
		}
		output = output + input.substring(input.indexOf(tempCh), input.lastIndexOf(tempCh));
		return output;
	}

	public static void main(String[] args) {
		Assignment40_Substring1 string = new Assignment40_Substring1();
		System.out.println("String between the first vowel place till its last index. ");
		System.out.println("Output: " + string.getSubstring("technocredits"));

	}
}
