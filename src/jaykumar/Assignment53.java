/*Assignment-53 : 13th Oct'2023
Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu*/

package jaykumar;

public class Assignment53 {

	String getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch != '*') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output += ch;
				}
			}
			input = input.replace(ch, '*');

		}
		return output;
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		System.out.println("Vowels in string are: "+assignment53.getVowels("aakaniksha eaep dube"));
	}
}
