/*Print vowels of the string only if count of vowels is greater than 2.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 	 yogesh -> vowels count is less than 2 in given string
	 	 shamli -> vowels count is less than 2 in given string*/
////
package mohit;

public class Assignment_56 {
	void printVowels(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String output = findVowelsFromStringIndex(str[index]);
			System.out.println(str[index] + "->" + output);

		}
	}

	String findVowelsFromStringIndex(String input) {
		String output = "";
		int count = countFromVowels(input);
		if (count > 2) {

			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output = output + ch;

				}

			}
			return output;

		} else {
			return "vowels count is less than 2 in given string";
		}

	}

	int countFromVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		new Assignment_56().printVowels(str);
	}
}
