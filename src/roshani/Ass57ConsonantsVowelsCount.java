/*Assignment-57 : 13th Oct'2023

WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9
*/

package roshani;

public class Ass57ConsonantsVowelsCount {
	void printConsonants(String input) {
		String output = "";
		int vowelCount = 0;
		int consonantCount = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  {
				vowelCount++;
			}else {
				consonantCount++;
				output += ch;
			}
		}
		System.out.println("Given string is: "+input);
		System.out.println("Consonants in given string are :"+output);
		System.out.println("Vowel count is: "+vowelCount);
		System.out.println("Consonants count is: "+consonantCount);
	}

	public static void main(String[] args) {
		Ass57ConsonantsVowelsCount assignment57 = new Ass57ConsonantsVowelsCount();
		assignment57.printConsonants("technocredits");
	}
}
