/*Assignment - 48 : 8th Oct'2023
Convert element case from given array, upper to lower and lower to upper.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	

output : ["rAH2U4L", "tECH3NO3crEDITS"]*/

package rahul;

import java.util.Arrays;

public class Assignment48_1 {

	String convertCase(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			}
			if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			}
			if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	void extractSingleString(String[] array) {
		for (int index = 0; index < array.length; index++) {
			String str = array[index];
			array[index] = convertCase(str);
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Assignment48_1 assignment48_1 = new Assignment48_1();
		String[] array = { "Rah2u4l", "Tech3no3CRedits" };
		assignment48_1.extractSingleString(array);
	}
}
