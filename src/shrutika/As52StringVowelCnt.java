/* Assignment-52 : 13th Oct'2023
String str = "technocredits";
output : 4 */
package shrutika;

public class As52StringVowelCnt {

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
		As52StringVowelCnt stringVowelCntA52 = new As52StringVowelCnt();
		stringVowelCntA52.vowel("technocredits");
	}
}
