/* Print the name having without digit from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : ["Rahul", "Technocredits", "Jay", "credits"] */

package sayali;

import java.util.Arrays;

public class Assignment47 {

	String getString(String input) {
		String output = " ";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		} return output;
	}

	void displayData(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			String s1 = input[index];
			output[index] = getString(s1);
		}

		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment47.displayData(input);
	}
}