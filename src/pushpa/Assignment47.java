//Assignment - 47 : 8th Oct'2023
//Print the name having maximum digit sum from given array.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3credits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : ["Rahul", "Technocredits", "Jay", "credits"]	 

package pushpa;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment47 {

	public void printStringMaxDigitSum(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String str1 = "";
			for (int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if (!Character.isDigit(ch))
					str1 += ch;
			}
			str[i] = str1;
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = new String[4];
		System.out.println("Enter String: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.next();
		}
		Assignment47 assignment47 = new Assignment47();
		assignment47.printStringMaxDigitSum(input);
		scanner.close();
	}

}
