/*Assignment-56 : 13th Oct'2023 Print vowels of longest string in an array

String[] str = {"technocredits","aakanksha","yogesh","shamli"}; 
output : technocredits -> eoei     
   */
package shrutika;

public class As56Arry {
	String str = "";

	String vowel(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str + ch;
			}
		}
		return str;
	}

	void longestString(String[] arry) {
		String maxLength = "";
		for (int index = 0; index < arry.length; index++) {
			if (arry[index].length() > maxLength.length()) {
				maxLength = arry[index];
			}
		}
		str = vowel(maxLength);
		System.out.println(maxLength + " -> " + str);
	}

	public static void main(String[] args) {
		String[] input = { "technocredits", "aakanksha", "yogesh", "shamli" };
		new As56Arry().longestString(input);
	}
}
