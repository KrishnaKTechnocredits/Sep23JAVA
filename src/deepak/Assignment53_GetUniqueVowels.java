/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu
*/

package deepak;

public class Assignment53_GetUniqueVowels {
	String getUniqueVowels(String input) {
		System.out.println("Input : " + input);
		String output = "";
		while (input.length() > 0) {
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment53_GetUniqueVowels output = new Assignment53_GetUniqueVowels();
		System.out.println("Output : " + output.getUniqueVowels("aakanikshaeaepdube"));
	}
}