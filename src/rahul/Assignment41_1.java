/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres*/

package rahul;

public class Assignment41_1 {

	void printSubString(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int first = input.indexOf(ch);
				str = input.substring(first);
				break;
			}
		}
		System.out.println("Output is: " + str);
	}

	public final static void main(String[] args) {
		Assignment41_1 assignment41_1 = new Assignment41_1();
		assignment41_1.printSubString("pqrabcgtyes");
	}
}
