/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtyes
*/

package deepak;

class Assignment41_Substring2 {
	char vowel;

	char getFirstVowel(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel = ch;
				break;
			}
		}
		return vowel;
	}

	String getSubstring(String input) {
		System.out.println("Input: " + input);
		String output = "";
		vowel = getFirstVowel(input);
		output = output + input.substring(input.indexOf(vowel));
		return output;
	}

	public static void main(String[] args) {
		Assignment41_Substring2 string = new Assignment41_Substring2();
		System.out.println("String from 1st vowel till end.");
		System.out.println("Output: " + string.getSubstring("pqirabcgtyes"));
	}
}
