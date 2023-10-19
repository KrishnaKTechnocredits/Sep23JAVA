/*
Assignment-52 : 13th Oct'2023
WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4
 */

package jagrati;

public class Assignment52 {
	int countVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("print the count of vowels in the given string " + count);
		return count;

	}

	public static void main(String[] args) {
		Assignment52 assign = new Assignment52();
		assign.countVowels("technocredits");
	}
}
