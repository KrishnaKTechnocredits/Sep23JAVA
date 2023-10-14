/*Assignment-51 : 13th Oct'2023
String str = "technocredits";
output : eoei */
package shrutika;

public class StringVowelA51 {

	void getVowel(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str + ch;
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		StringVowelA51 stringVowelA51 = new StringVowelA51();
		stringVowelA51.getVowel("technocredits");
	}
}
