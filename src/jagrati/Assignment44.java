/*
 Assignment - 44 : 8th Oct'2023 Array assignment

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]
 */

package jagrati;

import java.util.Arrays;

public class Assignment44 {
	String getCovertUpperCase(String str) {
		String output = "";
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = str.toUpperCase();
				flag = true;
			}
		}
		if (flag == true) {
			return output;
		} else
			return str;
	}

	void covertElement(String[] input) {
		for (int index = 0; index < input.length; index++) {
			System.out.println("Input of the string array is " + input[index]);
			input[index] = getCovertUpperCase(input[index]);
		}
		System.out.println("Output of the string array is " +Arrays.toString(input));

	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new Assignment44().covertElement(input);

	}
}
