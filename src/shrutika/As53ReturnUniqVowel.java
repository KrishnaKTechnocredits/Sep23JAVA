/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu */
package shrutika;

public class As53ReturnUniqVowel {

	void uniqueVowel(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str + ch;
				input = input.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		As53ReturnUniqVowel returnUniqVowelA53 = new As53ReturnUniqVowel();
		returnUniqVowelA53.uniqueVowel("aakaniksha eaep dube");
	}
}
