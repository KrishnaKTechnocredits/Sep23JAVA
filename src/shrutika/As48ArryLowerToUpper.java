/*Assignment - 48 : 8th Oct'2023
Convert element case from given array, upper to lower and lower to upper.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	output : ["rAH2U4L", "tECH3NO3crEDITS"]	*/
package shrutika;

import java.util.Arrays;

public class As48ArryLowerToUpper {

	String LowerToUpper(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		// System.out.println(output);
		return output;
	}

	void arrayConversion(String[] arry) {
		for (int index = 0; index < arry.length; index++) {
			arry[index] = LowerToUpper(arry[index]);
		}
		System.out.println(Arrays.toString(arry));
	}

	public static void main(String[] args) {
		As48ArryLowerToUpper arryLowerToUpperA48 = new As48ArryLowerToUpper();
		// arryLowerToUpperA48.LowerToUpper("Rah2u4l");
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		arryLowerToUpperA48.arrayConversion(input);
	}
}
