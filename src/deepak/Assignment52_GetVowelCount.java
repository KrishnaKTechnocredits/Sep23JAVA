/*Assignment-52 : 13th Oct'2023

WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4
*/
package deepak;

public class Assignment52_GetVowelCount {
	int getVowelCount(String input) {
		System.out.println("Input : " + input);
		int vCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			}
		}
		return vCount;
	}

	public static void main(String[] args) {
		Assignment52_GetVowelCount output = new Assignment52_GetVowelCount();
		System.out.println("Output : " + output.getVowelCount("technocredits"));
	}
}