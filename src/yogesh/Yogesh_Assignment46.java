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

package yogesh;

import java.util.Arrays;

public class Yogesh_Assignment46 {

	int maxDigitLength(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void getMaxSum(String[] input) {
		int maxsum = 0;
		String temp = "";
		for (int index = 0; index < input.length; index++) {
			int sum = maxDigitLength(input[index]);
			if (sum > maxsum) {
				maxsum = sum;
				temp = input[index];
			}

		}
		System.out.println("Maximum digit sum from given array is:--" + temp);
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Yogesh_Assignment46 assignment46 = new Yogesh_Assignment46();
		assignment46.getMaxSum(input);
	}
}
