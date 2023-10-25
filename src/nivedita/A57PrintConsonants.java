/*Assignment-57 : 13th Oct'2023
WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9
*/

package nivedita;

public class A57PrintConsonants {
	void getVowelConsonants(String input) {
		System.out.println("Input : " + input);
		String vOutput = "";
		String cOutput = "";
		System.out.println("Output : ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vOutput = vOutput + ch;
			} else
				cOutput = cOutput + ch;
		}
		System.out.println("Consonants in the given string are : " + cOutput);
		System.out.println("Count of vowels in given string is : " + vOutput.length());
		System.out.println("Count of consonants in given string is : " + cOutput.length());
	}

	public static void main(String[] args) {
		A57PrintConsonants output = new A57PrintConsonants();
		output.getVowelConsonants("technocredits");
	}

}