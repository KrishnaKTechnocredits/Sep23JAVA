/*Print the name without digit in given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : ["Rahul", "Technocredits", "Jay", "credits"]*/

package gaurang;

import java.util.Arrays;

public class Assignment47 {

	String getString(String x) {
		String output = "";
		for(int index=0 ; index<x.length() ; index++) {
			char ch = x.charAt(index);
			if(!Character.isDigit(ch)) {
				output += ch;
			}
		}
		return output;
	}
	
	void printArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0 ; index<input.length ; index++) {
			String x = input[index];
			output[index] = getString(x);
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment47 a = new Assignment47();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		a.printArray(input);
		
	}
}
