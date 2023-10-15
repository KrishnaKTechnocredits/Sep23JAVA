/* Assignment 44
Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]
*/
package nivedita;

import java.util.Arrays;

public class A44ConvertUpper {
	
	String[] processArray (String[] arr) {
		String[] output = new String[arr.length];
		for (int index=0; index<arr.length; index++) {
			String str = arr[index];
			boolean flag = containNum(str);
			if(flag) {
				str = str.toUpperCase();
			}
			output[index] = str;
		}
		return output;
	}
	
	boolean containNum (String input) {
		boolean flag = false;
		for (int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main (String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		String[] output = new A44ConvertUpper().processArray(input);
		System.out.println("Original array: "+Arrays.toString(input));
		System.out.println("Processed array: "+Arrays.toString(output));
	}
}
