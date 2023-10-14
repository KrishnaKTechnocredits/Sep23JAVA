/*Assignment-54 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu*/
package denish;

public class Assignment54 {

	void getVowels(String str) {
		String output = "";
		while (str.length() != 0) {
			char ch = str.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int update1 = str.length();
				str = str.replace(String.valueOf(ch), "");
				int update2 = str.length();
				if (update1 - update2 == 1) {
					output += ch;
				}
			}
			str = str.replace(String.valueOf(ch), "");
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment54 ass = new Assignment54();
		ass.getVowels("aakaniksha eaep dube");
	}
}
