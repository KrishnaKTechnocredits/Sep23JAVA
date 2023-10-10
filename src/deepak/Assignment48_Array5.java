/*
Assignment - 48 : 8th Oct'2023

Convert element case from given array, upper to lower and lower to upper.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	

output : ["rAH2U4L", "tECH3NO3crEDITS"]
*/
package deepak;

import java.util.Arrays;

public class Assignment48_Array5 {
	String stringCaseChange(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				output = output + Character.toLowerCase(ch);
			else if (Character.isLowerCase(ch))
				output = output + Character.toUpperCase(ch);
			else
				output = output + ch;
		}
		return output;
	}

	void arrayStringCaseChange(String[] input) {
		System.out.println("Input :" + Arrays.toString(input));
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = stringCaseChange(input[index]);
		}
		System.out.println("Output :" + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment48_Array5 output = new Assignment48_Array5();
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		output.arrayStringCaseChange(input);
	}
}
