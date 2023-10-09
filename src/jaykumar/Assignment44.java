/*Assignment - 44 : 8th Oct'2023
Convert the input element into upper case if it contains digit.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]*/
		
package jaykumar;

import java.util.Arrays;

public class Assignment44 {

	void processArray(String[] input) {
		for(int i=0; i<input.length; i++) {
			boolean flag = processString(input[i]);
			if(flag) {
				input[i] = input[i].toUpperCase();
			}
		}
		System.out.println("Array After: "+Arrays.toString(input));
	}
	
	boolean processString(String str) {
		boolean flag = false;
		for(int j=0; j<str.length(); j++) {
			char ch = str.charAt(j);
			if(Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Array Before: "+Arrays.toString(input));
		assignment44.processArray(input);
	}
}
