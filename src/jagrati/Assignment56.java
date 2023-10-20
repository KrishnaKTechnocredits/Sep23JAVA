/*Assignment-56 : 13th Oct'2023
 * String[] str = {"technocredits","aakanksha","yogesh","shamli"};
WAP to print vowels of the string only if count of vowels is greater than 2.
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 yogesh -> vowels count is less than 2 in given string
	 shamli -> vowels count is less than 2 in given string*/


package jagrati;

public class Assignment56 {
	String printVowels(String str) {
		String output = "";
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
				count++;
			}
		}
		if (count > 2) {
			return output;
		} else {
			return "Vowels count is less than or equal to 2";
		}
	}

	void getVowel(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String output = printVowels(input[index]);
			System.out.println(input[index] + "-->" + output);
		}

	}

	public static void main(String[] args) {
		String[] input = { "technocredits", "aakanksha", "yogesh", "shamli" };
		Assignment56 assign = new Assignment56();
		assign.getVowel(input);
	}
}
