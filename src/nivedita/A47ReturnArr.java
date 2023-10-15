/* Assignment 47
Return the array by removing numbers from the Strings array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]*/

package nivedita;

import java.util.Arrays;

public class A47ReturnArr {
	void printStringArray(String[] arr) {
		for (int index=0; index<arr.length; index++) {
			arr[index] = removeNum(arr[index]);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	String removeNum (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch))
				output += ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new A47ReturnArr().printStringArray(input);
	}
}
