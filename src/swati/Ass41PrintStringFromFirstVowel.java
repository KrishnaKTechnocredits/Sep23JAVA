/*Assignment 41: 01-Oct-23 WAP to print a string from 1st vowel 
Input: pqrabcgtyes 
Output: abcgtryes*/

package swati;

public class Ass41PrintStringFromFirstVowel {

	void printString(String input) {
		int firstindex = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				firstindex = input.indexOf(ch);
				break;
			}
		}
		String output = input.substring(firstindex);
		System.out.println("From first vowel input " + input + " ouput string is " + output);
	}

	public static void main(String[] args) {
		Ass41PrintStringFromFirstVowel ass41PrintStringFromFirstVowel = new Ass41PrintStringFromFirstVowel();
		ass41PrintStringFromFirstVowel.printString("pqrabcgtyes");
	}
}
