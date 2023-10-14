/*Assignment-55 : 13th Oct'2023
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai

void printVowels(String str){
	
}

void processData(){
	printVowels(arr[0]);
}

output : technocredits -> eoei*/

package Jyoti_Practice;

public class Assignment55 {

	void processData(String[] str) {

		for (int index = 0; index < str.length; index++) {
			String vowelString = "";
			vowelString = printVowels(str[index]);
			System.out.println("String--->" + str[index] + '\n' + "VowelString-->" + vowelString);
			System.out.println("========================================================");

		}

	}

	String printVowels(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}

		}
		return output;

	}

	public static void main(String[] args) {
		Assignment55 ass = new Assignment55();
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		ass.processData(str);

	}

}
