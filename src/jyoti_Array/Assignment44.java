/*Assignment - 44 : 8th Oct'2023

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]
*/

package jyoti_Array;

import java.util.Arrays;

public class Assignment44 {

	String uppercaseIfDigit(String str) {
		String newoutput = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				for (int innerindex = 0; innerindex < str.length(); innerindex++) {
					char ch1 = str.charAt(innerindex);
					newoutput = newoutput + Character.toUpperCase(ch1);
				}
				break;
			}
		}

		if (newoutput == "") {
			newoutput = str;
		}
		return newoutput;
	}

	String[] processData(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {

			System.out.println(arr[index]);
			String x = arr[index];
			output[index] = uppercaseIfDigit(x);

		}
		System.out.println(Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {

		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

		Assignment44 ass = new Assignment44();
		ass.processData(input);
	}

}
