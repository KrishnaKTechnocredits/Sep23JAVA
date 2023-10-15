//Assignment-51 : 13th Oct'2023
//String str = "technocredits";
//output : eoei
//
//String getVowels(String str){
//	
//}
//
//output : technocredits -> eoei

package pushpa;

import java.util.Scanner;

public class Assignment51 {

	public String getVowels(String input) {
		String vowles = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')
				vowles += ch;
		}

		return vowles;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scanner.next();
		Assignment51 assignment51 = new Assignment51();
		String result = assignment51.getVowels(str);
		System.out.println(str+" => "+result);
		scanner.close();
	}

}
