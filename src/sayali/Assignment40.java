/* WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr */
package sayali;

public class Assignment40 {

	void printString(String input) {
		int firstindex = input.indexOf('e');
		int lastindex = input.lastIndexOf('e');
		String output = input.substring(firstindex, lastindex);
		System.out.println("Output: " + output);
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.printString("technocredits");
	}
}
