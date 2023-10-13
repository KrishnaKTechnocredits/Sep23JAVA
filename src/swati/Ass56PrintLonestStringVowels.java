/*Assignment-56 : 13th Oct'2023 Print vowels of longest string in an array

String[] str = {"technocredits","aakanksha","yogesh","shamli"}; 
output : technocredits -> eoei     
   */
package swati;

public class Ass56PrintLonestStringVowels {
	String output = "";

	String getVowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		return output;
	}

	void printVowels(String[] arr) {
		String maxlengthstr = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxlengthstr.length()) {
				maxlengthstr = arr[index];
			}
		}
		output = getVowels(maxlengthstr);
		System.out.println(maxlengthstr+" --> "+output);
	}

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		new Ass56PrintLonestStringVowels().printVowels(str);
	}
}
