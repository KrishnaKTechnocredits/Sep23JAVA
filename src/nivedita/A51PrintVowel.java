/*Assignment-51 : 13th Oct'2023 
String str = "technocredits"; 
output : eoei
String getVowels(String str){ } 
output : technocredits -> eoei*/

package nivedita;

public class A51PrintVowel{

	void printVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println("Vowels in string are -> "+output);
	}

	public static void main(String[] args) {
		new A51PrintVowel().printVowels("technocredits");

	}
}
