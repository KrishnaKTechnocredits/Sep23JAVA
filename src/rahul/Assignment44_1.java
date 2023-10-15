/*Assignment - 44 : 8th Oct'2023

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]*/

package rahul;

import java.util.Arrays;

public class Assignment44_1 {

	String checkForDigit(String input) {
		String upper = "";
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				upper = input.toUpperCase();
				flag = false;
				break;
			}
		}
		if (flag == true && upper == "") {
			upper = input;
			return upper;
		} else
			return upper;
	}

	void getString(String[] input) {
		String str = "";
		String[] arrayOutput = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			str = input[index];
			arrayOutput[index] = checkForDigit(str);
		}
		System.out.println(Arrays.toString(arrayOutput));
	}

	public static void main(String[] args) {
		Assignment44_1 assignment44_1 = new Assignment44_1();
		String[] arr = { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" };
		assignment44_1.getString(arr);
	}
}
