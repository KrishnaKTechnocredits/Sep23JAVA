/*Assignment-52 : 13th Oct'2023

WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4*/

package Jyoti_Practice;

public class Assignment52 {
	int count = 0;

	int getVowels(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}

		return count;
	}

	public static void main(String[] args) {

		Assignment52 ass = new Assignment52();
		System.out.println("Count is--->" + ass.getVowels("technocredits"));
	}
}
