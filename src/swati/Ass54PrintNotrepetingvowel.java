/*Assignment-54 : 13th Oct'2023 Write a program to print non repetitive vowels included 
in the string, ensure sequence is maintained.
 String str = "aakaniksha eaep dube";
 output : iu
*/

package swati;

public class Ass54PrintNotrepetingvowel {

	void printNonRepetitiveVowel(String input) {
		String output = "";
		while (input.length() != 0) {
			int orglen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int newlen = input.length();
				if (orglen - newlen == 1) {
					output = output + ch;
				}
			}
		}
		System.out.println("Unique vowels are -> " + output);
	}

	public static void main(String[] args) {
		new Ass54PrintNotrepetingvowel().printNonRepetitiveVowel("aakaniksha eaep dube");
	}
}
