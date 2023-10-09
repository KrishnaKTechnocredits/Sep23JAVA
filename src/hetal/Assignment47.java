/*print the string without digit*/

package hetal;

import java.util.Arrays;

public class Assignment47 {
	
	void printString(String[] arr) {
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			String str = arr[index];
			output[index] = getOutput(str);
		}
		System.out.println(Arrays.toString(output));
	}
	
	
	String getOutput(String input) {
		String Output = "";
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				Output = Output + ch;
			}
		}
		return Output;	
	}
	
	public static void main(String[] args) {
		String[] input =new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "j6a6y";
		input[3] = "cred5it2s";
		new Assignment47().printString(input);
	}

}
