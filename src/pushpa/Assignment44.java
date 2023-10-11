//Assignment - 44
//
//Convert the input element into upper case if it contains digit.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Technocredits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]

package pushpa;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment44 {

	public void convertStringToUpper(String str[]) {
		System.out.println("String before conversion: " + Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (Character.isDigit(str[i].charAt(j))) {
					str[i] = str[i].toUpperCase();
					break;
				}
			}
		}
		System.out.println("String after conversion: " + Arrays.toString(str));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = new String[4];
		System.out.println("Enter String: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.next();
		}
		Assignment44 assignment44 = new Assignment44();
		assignment44.convertStringToUpper(input);
		scanner.close();
	}

}
