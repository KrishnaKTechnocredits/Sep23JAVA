/*Assignment-52 : 13th Oct'2023

WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4
*/
package rahul;

public class Assignment52_1 {

	void printVowelCount(String str) {
		int vowelCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println("Vowels in " + str + " are: " + vowelCount);
	}

	public static void main(String[] args) {
		Assignment52_1 assignment52_1 = new Assignment52_1();
		assignment52_1.printVowelCount("technocredits");
	}
}
