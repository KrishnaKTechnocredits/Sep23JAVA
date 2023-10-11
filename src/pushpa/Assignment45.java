//Assignment - 45 : 8th Oct'2023
//
//Print the name having maximum and minimum length from given array.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Technocredits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//
//output : Min length name is : J6a6y
//         Max length name is : Technocredits

package pushpa;

import java.util.Scanner;

public class Assignment45 {

	public void printMinMaxLength(String str[]) {
		String minLengthName = str[0], maxLengthName = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < minLengthName.length())
				minLengthName = str[i];

			if (str[i].length() > maxLengthName.length())
				maxLengthName = str[i];
		}
		System.out.println("Min length name is: " + minLengthName);
		System.out.println("Max length name is: " + maxLengthName);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = new String[4];
		System.out.println("Enter String: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.next();
		}
		Assignment45 assignment45 = new Assignment45();
		assignment45.printMinMaxLength(input);
		scanner.close();
	}

}
