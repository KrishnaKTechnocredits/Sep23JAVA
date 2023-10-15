//Assignment-52 : 13th Oct'2023
//String str = "technocredits";
//output : 4

package pushpa;

import java.util.Scanner;

public class Assignment52 {

	public int getVowelsCount(String input) {
		int vowlesCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				vowlesCount++;
		}

		return vowlesCount;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scanner.next();
		Assignment52 assignment52 = new Assignment52();
		int result = assignment52.getVowelsCount(str);
		System.out.println("No of Vowls in String: " + result);
		scanner.close();
	}

}
