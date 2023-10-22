/*WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9*/

package mohit;

public class Assignment_57 {
	int vowelCount = 0;
	int consonantCount = 0;
	String output = "";

	void printConsonants(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {
				output = output + ch;
				consonantCount++;
			}
		}
		System.out.println("consonants in the given string are : " + output);
		System.out.println("Count of vowels in given string is : " + vowelCount);
		System.out.println("Count of consonants in given string is : " + consonantCount);
	}

	public static void main(String[] args) {
		new Assignment_57().printConsonants("technocredits");
	}
}
