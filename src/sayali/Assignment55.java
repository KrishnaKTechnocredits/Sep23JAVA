/* WAP to print vowels for each element available in the given string array
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai */

package sayali;

public class Assignment55 {

	void printVowels(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = getVowels(arr[index]);
			System.out.println(arr[index] + " -> " + str);
		}
	}

	String getVowels(String input) {
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
		String[] input = { "technocredits", "aakanksha", "yogesh", "shamli" };
	
		Assignment55 assignment55 = new Assignment55();
		assignment55.printVowels(input);
	}
}