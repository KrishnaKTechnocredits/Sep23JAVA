
/*print vowels for each element available in the given string array

String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai*/

package mohit;

public class Assignment_55 {
	void printVowels(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String vowels = getVowelsFromArrayIndex(input[index]);
			System.out.println(input[index] + "->" + vowels);
		}

	}

	String getVowelsFromArrayIndex(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		new Assignment_55().printVowels(str);
	}

}
