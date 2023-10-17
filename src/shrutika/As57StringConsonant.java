/*WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9 */
package shrutika;

public class As57StringConsonant {

	void consonantsVowels(String input) {
		int consonantsCount = 0;
		int vowelsCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else
				consonantsCount++;
		}
		System.out.println(input + "\nVowels are -> " + vowelsCount + "\nConsonants are -> " + consonantsCount);
	}

	public static void main(String[] args) {
		As57StringConsonant as57StringConsonant = new As57StringConsonant();
		as57StringConsonant.consonantsVowels("technocredits");
	}
}
