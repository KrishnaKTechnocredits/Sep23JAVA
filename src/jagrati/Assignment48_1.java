/*
Assignment - 48 : 8th Oct'2023
Convert element case from given array, upper to lower and lower to upper.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
output : ["rAH2U4L", "tECH3NO3crEDITS"]
 */

package jagrati;

import java.util.Arrays;

public class Assignment48_1 {

	String getLowerUpper(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else  
				output = output + ch;
		}
		//System.out.println(output);
		return output;
	}

	void covertCase(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getLowerUpper(input[index]);
		}
		System.out.println("Coverted String array is " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		Assignment48_1 assign = new Assignment48_1();
		assign.covertCase(input);
	}
}
