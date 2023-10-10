/*Convert element case from given array, upper to lower and lower to upper.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	

output : ["rAH2U4L", "tECH3NO3crEDITS"]*/

package gaurang;

import java.util.Arrays;

public class Assignment48 {

	String getString(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output += Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				output += Character.toUpperCase(ch);
			}
			else {
				output += ch;
			}
		}
		return output;
	}
	
	void getPrint(String[] input) {
		String[] output = new String[input.length];
		for(int index=0 ; index<input.length ; index++ ) {
			String x = input[index];
			output[index] = getString(x);
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment48 a = new Assignment48();
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		a.getPrint(input);
	}
}
