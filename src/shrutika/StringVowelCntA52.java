/* Assignment-52 : 13th Oct'2023
String str = "technocredits";
output : 4 */
package shrutika;

public class StringVowelCntA52 {

	void vowel(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Count of vowel in given string is -> " +count);
	}

	public static void main(String[] args) {
		StringVowelCntA52 stringVowelCntA52 = new StringVowelCntA52();
		stringVowelCntA52.vowel("technocredits");
	}
}
