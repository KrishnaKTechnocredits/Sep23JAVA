/*Assignment-57 : 13th Oct'2023 WAP to print consonants in the given 
String and count of vowels and consonants
String str = "technocredits"; 
output : Consonants in the given string are : tchncrdts 
Count of vowels in given string is : 4 
Count of consonants in given string is : 9*/

package swati;

public class Ass57PrintConsonantsInString {

	void getConsonants(String input) {
		int consocount = 0;
		int vowelcount = 0;
		String consonantsoutput = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				consonantsoutput = consonantsoutput + ch;
				consocount++;
			} else
				vowelcount++;
		}
		System.out.println(" Consonants in the given string are : " + consonantsoutput);
		System.out.println("Count of vowels in given string is : " + vowelcount);
		System.out.println("Count of consonants in given string is :" + consocount);
	}

	public static void main(String[] args) {
		new Ass57PrintConsonantsInString().getConsonants("technocredits");
	}
}
