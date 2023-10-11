/* WAP to Convert the input element into upper case if it contains digit.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S] */

package sayali;

import java.util.Arrays;

public class Assignment44 {

	String convertToUpperCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				for (int innerindex = 0; innerindex < input.length(); innerindex++) {
					char c1 = input.charAt(innerindex);
					output = output + Character.toUpperCase(c1);
				}
				break;
			}
		}
		if (output == "") {
			output = input;
		}
		return output;
	}

	String[] getUpperCaseString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			output[index] = convertToUpperCase(str);
		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment44.getUpperCaseString(input);
	}
}