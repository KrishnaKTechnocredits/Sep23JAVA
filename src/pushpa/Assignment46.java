//Assignment - 46 : 8th Oct'2023
//Print the name having maximum digit sum from given array.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3credits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//
//output : J6a6y -> 12

package pushpa;

import java.util.Scanner;

public class Assignment46 {

	public void printNameMaxDigitSum(String str[]) {
		int sum = 0;
		String name = "";
		for (int i = 0; i < str.length; i++) {
			int tempSum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if (Character.isDigit(str[i].charAt(j)))
					tempSum += Character.getNumericValue(str[i].charAt(j));
			}
			if (tempSum > sum) {
				sum = tempSum;
				name = str[i];
			}
		}
		System.out.println(name + " => " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = new String[4];
		System.out.println("Enter String: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.next();
		}
		Assignment46 assignment46 = new Assignment46();
		assignment46.printNameMaxDigitSum(input);
		scanner.close();
	}

}
