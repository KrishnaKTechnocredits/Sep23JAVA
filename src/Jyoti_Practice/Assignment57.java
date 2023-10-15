/*Assignment-57 : 13th Oct'2023

WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9*/
package Jyoti_Practice;

public class Assignment57 {

	void getVowels(String str) {
		String voutput = "";
		String coutput = "";
		int vcount = 0;
		int originalLength = str.length();
		int clength = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vcount++;
				voutput = voutput + ch;
			} else if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				clength = originalLength - vcount;
				coutput = coutput + ch;

			}

		}
		System.out.println("consonants-->" + coutput + '\n' + "Counts-->" + clength);
		System.out.println("===============================================");
		System.out.println("Vowels-->" + voutput + '\n' + "Counts-->" + vcount);

	}

	public static void main(String[] args) {
		Assignment57 ass = new Assignment57();
		ass.getVowels("technocredits");
	}

}
