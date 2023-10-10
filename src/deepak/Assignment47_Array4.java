/*
Assignment - 47 : 8th Oct'2023

Print the names without digits in it from the given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]	 
*/
package deepak;

import java.util.Arrays;

public class Assignment47_Array4 {
	String getStringWithNoDigits(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch))
				output = output + ch;
		}
		return output;
	}

	void getArraywithNoDigits(String[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = getStringWithNoDigits(input[index]);
		}
		System.out.println("Output : " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment47_Array4 output = new Assignment47_Array4();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		output.getArraywithNoDigits(input);
	}

}
