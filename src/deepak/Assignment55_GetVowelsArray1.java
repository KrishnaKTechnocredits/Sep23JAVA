/*Assignment-55 : 13th Oct'2023

WAP to print vowels of each string from the given String array.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai
*/

package deepak;

import java.util.Arrays;

public class Assignment55_GetVowelsArray1 {
	String getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}

	void getVowelsFromArray(String[] input) {
		System.out.println("Input Array : " + Arrays.toString(input));
		String vowelString = "";
		System.out.println("Output : ");
		for (int index = 0; index < input.length; index++) {
			vowelString = getVowels(input[index]);
			System.out.println(input[index] + " -> " + vowelString);
		}
	}

	public static void main(String[] args) {
		Assignment55_GetVowelsArray1 output = new Assignment55_GetVowelsArray1();
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		output.getVowelsFromArray(str);
	}
}