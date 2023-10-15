/*Assignment-56 : 13th Oct'2023

WAP to print vowels of the string only if count of vowels is greater than 2.
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 	yogesh -> vowels count is less than 2 in given string
	 	shamli -> vowels count is less than 2 in given string
*/

package deepak;

import java.util.Arrays;

public class Assignment56_GetVowelsArray2 {
	String getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				output = output + ch;
		}
		return output;
	}

	void getVowelsFromArray(String[] input) {
		System.out.println("Input Array : " + Arrays.toString(input));
		String vowelString = "";
		System.out.println("Output : ");
		for (int index = 0; index < input.length; index++) {
			vowelString = getVowels(input[index]);
			if (vowelString.length() > 2)
				System.out.println(input[index] + " -> " + vowelString);
			else
				System.out.println(input[index] + " -> " + "vowels count is less than or equal to 2 in given string");
		}
	}

	public static void main(String[] args) {
		Assignment56_GetVowelsArray2 output = new Assignment56_GetVowelsArray2();
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		output.getVowelsFromArray(str);
	}
}