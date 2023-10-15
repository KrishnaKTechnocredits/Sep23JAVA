/*Assignment - 47 : 8th Oct'2023
Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]	*/

package jyoti_Array;

import java.util.Arrays;

public class Assignment47 {

	String getOutput(String str) {
		String output = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String[] processData(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {

			System.out.println(arr[index]);
			String x = arr[index];
			output[index] = getOutput(x);

		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] arg) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

		Assignment47 ass47 = new Assignment47();
		ass47.processData(input);

	}
}
