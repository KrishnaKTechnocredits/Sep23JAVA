/*Assignment-51 : 13th Oct'2023

WAP to print vowels in the given String
String str = "technocredits";
output : eoei*/

package rahul;

public class Assignment51_1 {

	void printVowels(String str) {
		String vowels = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels = vowels + ch;
			}
		}
		System.out.println("Vowels in " + str + " are: " + vowels);
	}

	public static void main(String[] args) {
		Assignment51_1 assignment51_1 = new Assignment51_1();
		assignment51_1.printVowels("technocredits");
	}
}
