/* WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9 */

package sayali;

public class Assignment57 {

	void printConsonants (String input) {
		int vowelCount = 0;
		int consonantCount = 0;
		String output = "";

		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelCount++;
			}else {
				output += ch;
				consonantCount++;
			}
		}
		System.out.println("Consonants in the given string are : "+output);
		System.out.println("Count of vowels in given string is : "+vowelCount);
		System.out.println("Count of consonants in given string is : "+consonantCount);
	}

	public static void main (String[] args) {
		Assignment57 assignment57 = new Assignment57();
		assignment57.printConsonants("technocredits");
	}
}