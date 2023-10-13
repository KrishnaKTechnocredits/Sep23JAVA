/*Assignment-52 : 13th Oct'2023 Print count of vowels in string
String str = "technocredits"; 
output : 4 */

package swati;

public class Ass52PrintCountOfVowels {

	void printCountOfVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Count of Vowels in given string are -> " + count);
	}

	public static void main(String[] args) {
		new Ass52PrintCountOfVowels().printCountOfVowels("technocredits");
	}
}
