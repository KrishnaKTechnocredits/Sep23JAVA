//Assignment - 48 : 8th Oct'2023
//Convert element case from given array, upper to lower and lower to upper.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3CRedits";
//	
//
//output : ["rAH2U4L", "tECH3NO3crEDITS"]
//		
package pushpa;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment48 {

	public void convertStingChars(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String str1 = "";
			for (int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if (Character.isUpperCase(ch)) 
					str1 += Character.toLowerCase(ch);
				else if(Character.isLowerCase(ch))
					str1 += Character.toUpperCase(ch);
				else
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
		Assignment48 assignment48 = new Assignment48();
		assignment48.convertStingChars(input);
		scanner.close();
	}

}
