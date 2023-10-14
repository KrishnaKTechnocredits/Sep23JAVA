/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu*/
package denish;

public class Assignment53 {

	void getVowels(String str) {
		String output = "";
		while (str.length() != 0) {
			char ch = str.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
			str = str.replace(String.valueOf(ch), "");
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment53 ass = new Assignment53();
		ass.getVowels("aakaniksha eaep dube");
	}
}
