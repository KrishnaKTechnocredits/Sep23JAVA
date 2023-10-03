/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtyes */
package shrutika;

public class FirstVowelA41 {

	void stringFirstVowel(String input) {
		String output = "";
		int firstvowel = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				firstvowel = input.indexOf(ch);
				output = input.substring(firstvowel);
				break;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		FirstVowelA41 firstVowelA41 = new FirstVowelA41();
		firstVowelA41.stringFirstVowel("pqrabcgtyes");
	}
}
