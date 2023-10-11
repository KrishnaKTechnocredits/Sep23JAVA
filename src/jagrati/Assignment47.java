/*
 Assignment - 47 : 8th Oct'2023
remove digit from given staring array

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]
 */

package jagrati;

import java.util.Arrays;

public class Assignment47 {
	String getOutput(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		} // System.out.println(output);
		return output;
	}

	void removeDigit(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getOutput(input[index]);
		}
		System.out.println("String array after remove digit " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Assignment47 assign = new Assignment47();
		assign.removeDigit(input);
	}
}
