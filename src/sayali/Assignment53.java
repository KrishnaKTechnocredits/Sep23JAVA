/* Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu */

package sayali;

public class Assignment53 {

	void getUniqueVowels(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch != '*') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output += ch;
					str = str.replace(ch, '*');
				}
			}
		}
		System.out.println("Unique vowels in the given string are : " + output);
	}

	public static void main(String[] args) {
		new Assignment53().getUniqueVowels("aakaniksha eaep dube");
	}
}