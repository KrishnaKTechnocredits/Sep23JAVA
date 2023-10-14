//WAP to print consonants in the given String and count of vowels and consonants
//String str = "technocredits";
//output : 
//Consonants in the given string are : tchncrdts
//Count of vowels in given string is : 4
//Count of consonants in given string is : 9

package pushpa;

import java.util.Scanner;

public class Assignment57 {
	char[] vowlesArr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

	public void printConsonantVowel(String str) {
		int vowelCount = 0, consonantCount = 0;
		String consonants = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (new String(vowlesArr).contains(Character.toString(ch))) {
				vowelCount++;
			} else {
				consonants += ch;
				consonantCount++;
			}
		}
		System.out.println("Consonants in the given string are: "+consonants);
		System.out.println("Vowel Count: "+vowelCount);
		System.out.println("COnsonant Count: "+consonantCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.next();
		Assignment57 assignment57 = new Assignment57();
		assignment57.printConsonantVowel(input);
		scanner.close();
	}

}
