/*Convert element case from given array, upper to lower and lower to upper.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	

output : ["rAH2U4L", "tECH3NO3crEDITS"]*/

package mohit;

import java.util.Arrays;

public class Assignment_48 {
	void printStringArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arr[index] = processArray(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
	}

	String processArray(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			output=output+ch;

		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";

		Assignment_48 assignment_48 = new Assignment_48();
		assignment_48.printStringArray(input);
	}
}
