/*Assignment-57 : 13th Oct'2023

WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9*/
package denish;

public class Assignment57 {

	void processData(String input) {
		String output = "";
		int vowel = 0;
		int consonant = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				output = output + ch;
				consonant++;
			}
		}
		System.out.println("Consonants in the given string are -> " + output);
		System.out.println("Count of vowels in given string is -> " + vowel);
		System.out.println("Count of consonants in given string is -> " + consonant);
	}

	public static void main(String[] args) {
		Assignment57 ass = new Assignment57();
		ass.processData("technocredits");
	}
}
