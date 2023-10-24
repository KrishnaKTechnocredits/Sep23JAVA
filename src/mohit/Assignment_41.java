/*WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtyes*/

package mohit;

public class Assignment_41 {

	void findVowel(String input) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count = index;
				break;
			}
		}

		System.out.println(input.substring(count));

	}

	public static void main(String[] args) {
		new Assignment_41().findVowel("pqrabcgtyes");

	}
}
