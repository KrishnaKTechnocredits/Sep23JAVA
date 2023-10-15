/*Assignment-55 : 13th Oct'2023
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai*/
package denish;

import java.util.Arrays;

public class Assignment55 {

	String printVowels(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		// System.out.println(output);
		return output;
	}

	void processData(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String update = arr[index];
			output[index] = printVowels(update);
			System.out.println(update + "-->" + output[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		Assignment55 ass = new Assignment55();
		ass.processData(str);
	}
}
