/*Assignment - 47 : 8th Oct'2023
Print the name Eliminate digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s"; 
output : ["Rahul", "Technocredits", "Jay", "credits"]	*/
package shrutika;

import java.util.Arrays;

public class As47ArrEliminateDigit {

	String getOutput(String input) {
		String output ="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				output = output+ch;
			}
		}
		return output;
	}
	
	void elimatedDigitArry(String[] arry) {
		for (int index=0;index<arry.length;index++) {
			arry[index]=getOutput(arry[index]);
		}
		System.out.println(Arrays.toString(arry));
	}
	
	public static void main(String[] args) {
		As47ArrEliminateDigit arrEliminateDigitA47 = new As47ArrEliminateDigit();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s"; 
		arrEliminateDigitA47.elimatedDigitArry(input);
	}
}
