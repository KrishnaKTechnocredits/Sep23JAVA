/*Assignment - 44 : 8th Oct'2023

Convert the input element into upper case if it contains digit.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : [RAH2U4L, Technocredits, J6A6Y, CRED5IT2S]
*/


package deepak;

import java.util.Arrays;

public class Assignment44_Array1 {
	
	String getUpperCase(String input){
		for(int index  = 0 ; index < input.length() ; index++){
			char ch  = input.charAt(index);
			if(Character.isDigit(ch)){
				input = input.toUpperCase();
			}
		}
		return input;
	}
	
	String[] getArray(String[] input){
		System.out.println("Input Array: "+Arrays.toString(input));
		String[] output = new String[input.length];
		for(int index = 0 ; index < input.length ; index++){
			output[index] = getUpperCase(input[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment44_Array1 output = new Assignment44_Array1();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Output Array: "+Arrays.toString(output.getArray(input)));
	}

}
