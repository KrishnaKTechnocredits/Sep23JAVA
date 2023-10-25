/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr*/

package mohit;

public class Assignment_40 {
	void printString(String input,char ch) {
		String updatedInput= input.substring(input.indexOf(ch),input.lastIndexOf(ch));
		System.out.println(updatedInput);
	}
	public static void main(String[] args) {
		new Assignment_40().printString("technocredits",'e');
	}

}
