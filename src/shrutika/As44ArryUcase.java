/*Assignment - 44 : 8th Oct'2023

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]*/
package shrutika;

import java.util.Arrays;

public class As44ArryUcase {

	String uCase(String input) {
		String output = "";
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				output = input.toUpperCase();
				break;
			}
		}
		if (flag == true) {
			return output;
		} else
			return input;
	}

	void arryUcase(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arr[index] = uCase(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		As44ArryUcase arryUcaseA44 = new As44ArryUcase();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		arryUcaseA44.arryUcase(input);
	}
}
