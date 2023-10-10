/*Assignment - 45 : 8th Oct'2023

	Print the name having maximum and minimum length from given array.

	String[] input = new String[4];
			input[0] = "Rah2u4l";
			input[1] = "Technocredits";
			input[2] = "J6a6y";
			input[3] = "cred5it2s";

	output : Min length name is : J6a6y
	         Max length name is : Technocredits
	*/
package deepak;

import java.util.Arrays;

public class Assignment45_Array2 {

	int getLength(String input) {
		int temp = input.length();
		int strLen = input.length();
		return strLen;
	}

	void getMaxLengthString(String[] input) {
		int temp = input[0].length();
		String max = "";
		for (int index = 0; index < input.length; index++) {
			int strLen = getLength(input[index]);
			if (temp < strLen) {
				temp = strLen;
				max = input[index];
			}
		}
		System.out.println("Max length String is: "+max);
	}

	void getMinLengthString(String[] input) {
		int temp = input[0].length();
		String min = "";
		for (int index = 0; index < input.length; index++) {
			int strLen = getLength(input[index]);
			if (temp > strLen) {
				temp = strLen;
				min = input[index];
			}
		}
		System.out.println("Min length String is: "+min);
	}

	public static void main(String[] args) {
		Assignment45_Array2 output = new Assignment45_Array2();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Input : "+Arrays.toString(input));
		output.getMaxLengthString(input);
		output.getMinLengthString(input);

	}

}
