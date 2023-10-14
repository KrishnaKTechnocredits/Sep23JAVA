/*Assignment-54 : 13th Oct'2023 Write a program to print non repetitive vowels included 
in the string, ensure sequence is maintained.
 String str = "aakaniksha eaep dube";
 output : iu
*/

package nivedita;

public class A54PrintVowel {

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
		new A54PrintVowel().printNonRepetitiveVowel("aakaniksha eaep dube");
	}
}
