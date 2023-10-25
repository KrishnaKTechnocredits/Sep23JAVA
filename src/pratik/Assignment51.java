/*Assignment-51 : 13th Oct'2023
String str = "technocredits";
output : eoei

String getVowels(String str){
	
}

output : technocredits -> eoei*/

package pratik;

public class Assignment51 {

	void printVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println("Vowels in given string are : " + output);
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		assignment51.printVowels("technocredits");

	}
}
