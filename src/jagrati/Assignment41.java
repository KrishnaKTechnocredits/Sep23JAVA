/*
 Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres
 */

package jagrati;

public class Assignment41 {
	void vowels(String input) {
		int firstIndex = input.indexOf('a');
		int lastIndex = input.lastIndexOf('s')+1;
		String output = input.substring(firstIndex, lastIndex);
		System.out.println("string from 1st vowel --> " + output);
	}
public static void main(String[] args) {
	Assignment41 assign = new Assignment41();
	assign.vowels("pqrabcgtyes");
}
}
