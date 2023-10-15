//Assignment-55 : 13th Oct'2023
//String[] str = {"technocredits","aakanksha","yogesh","shamli"};
//output : technocredits -> eoei
//         aakanksha -> aaaa
//		 yogesh -> oe
//		 shamli -> ai

package pushpa;

import java.util.Scanner;

public class Assignment55 {

	public void printVowelsInString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String vowels = "";
			for (int j = 0; j < input[i].length(); j++) {
				Character ch = input[i].charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U')
					vowels += ch;
			}
			System.out.println(input[i] + " => " + vowels);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String str[] = new String[5];
		for (int i = 0; i < str.length; i++) {
			str[i] = scanner.next();
		}

		Assignment55 assignment55 = new Assignment55();
		assignment55.printVowelsInString(str);
		scanner.close();
	}

}
