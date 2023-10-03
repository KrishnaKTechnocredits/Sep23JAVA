/*Assignment 40: 01-Oct-23 WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
 *  Input: technocredits
 *  Output: echnocr
 */

package swati;

public class Ass40PrintFrom1stRepetingVowel {

	void printString(String input) {
		int firstindex = input.indexOf('e');
		int lastindex = input.lastIndexOf('e');
		String output = input.substring(firstindex, lastindex);
		System.out.println("From string input " + input + " output of 1st repetiting 'e' to last 'e' is ->" + output);
	}

	public static void main(String[] args) {
		Ass40PrintFrom1stRepetingVowel ass40PrintFrom1stRepetingVowel = new Ass40PrintFrom1stRepetingVowel();
		ass40PrintFrom1stRepetingVowel.printString("technocredits");
	}
}
