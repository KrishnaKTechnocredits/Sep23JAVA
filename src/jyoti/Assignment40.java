/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
*/

package jyoti;

public class Assignment40 {

	void getProcessedData(String str, char ch) {
		int first = str.indexOf(ch);
		int last = str.lastIndexOf(ch);
		String output = str.substring(first, last);
		System.out.println("Output is " + output);
	}

	public static void main(String[] args) {
		Assignment40 ps = new Assignment40();
		ps.getProcessedData("technocredits", 'e');

	}

}