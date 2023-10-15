/*Assignment-54 : 13th Oct'2023

Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu
*/

package deepak;

public class Assignment54_GetUniqueNonRepVowels {
	String getUniqueNonRepVowels(String input) {
		System.out.println("Input : " + input);
		String output = "";
		while (input.length() > 0) {
			int oLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int nLen = input.length();
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if ((oLen - nLen) == 1)
					output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment54_GetUniqueNonRepVowels output = new Assignment54_GetUniqueNonRepVowels();
		System.out.println("Output : " + output.getUniqueNonRepVowels("aakaniksha eaep dube"));
	}
}
