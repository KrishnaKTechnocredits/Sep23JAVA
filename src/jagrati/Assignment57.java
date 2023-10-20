/*Assignment-57 : 13th Oct'2023

WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9
 */

package jagrati;

public class Assignment57 {
	void vowels(String input) {
		String output = "";
		int vCount = 0;
		int cCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			} else {
				cCount++;
				output = output + ch;
			}
		}
		System.out.println("Consonants in the given string are : " + output);
		System.out.println("Count of vowels in given string is : " + vCount);
		System.out.println("Count of consonants in given string is :" + cCount);
	}

	public static void main(String[] args) {
		Assignment57 assign = new Assignment57();
		assign.vowels("technocredits");
	}
}
