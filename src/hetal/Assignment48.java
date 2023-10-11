/*Convert element case from given array, upper to lower and lower to upper.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	output : ["rAH2U4L", "tECH3NO3crEDITS"]*/

package hetal;

import java.util.Arrays;

public class Assignment48 {

	void printArr(String[] arr) {
		String[] output = new String[arr.length];
		for(int index=0 ; index<arr.length ; index++) {
			String str = arr[index];
			output[index] = getUpperLower(str);
		}
		System.out.println(Arrays.toString(output));
	}
	
	String getUpperLower(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output += Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			}
			else {
				output = output + ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		new Assignment48().printArr(input);
	}
}
