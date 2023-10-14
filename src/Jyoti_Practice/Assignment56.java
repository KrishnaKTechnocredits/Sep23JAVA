/*Assignment-56 : 13th Oct'2023

WAP to print vowels of the string only if count of vowels is greater than 2.
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 yogesh -> vowels count is less than 2 in given string
	 shamli -> vowels count is less than 2 in given string
	 */
package Jyoti_Practice;

public class Assignment56 {

	String printString(String str) {
		String output = "";
		int originalLength = str.length();
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;

			}

		}

		return output;

	}

	void processData(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String vowelString = "";
			vowelString = printString(str[index]);
			if (vowelString.length() > 2) {
				System.out.println(
						str[index] + "--Vowel String length is greater than 2-->" + '\n' + "vowel-->" + vowelString);
				System.out.println("========================================================================");
			} else {
				System.out.println("*************************************************************************");
				System.out.println(
						str[index] + "---vowel String is less than or equal to 2-->" + '\n' + "vowel-->" + vowelString);
			}
		}

	}

	public static void main(String[] args) {
		Assignment56 ass = new Assignment56();
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		ass.processData(str);
	}

}
