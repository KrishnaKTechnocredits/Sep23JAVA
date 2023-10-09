/*Assignment - 48 : 8th Oct'2023
Convert element case from given array, upper to lower and lower to upper.

String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
	

output : ["rAH2U4L", "tECH3NO3crEDITS"]	

String[] processData(String[] arr){
	String[] output = new String[arr.length];
	output[index] = convertCase(arr[index]);
	
	return output;
}
*/
package roshani;

import java.util.Arrays;

public class Ass48ConvertCase{
	
	String getUpperLowerCase(String str){
		String output = "";
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)){
				output = output + Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)){
				output = output + Character.toUpperCase(ch);
			}else {
				output = output + ch; 
			}
		}
		return output;
	}
	
	void convCase(String[] arr){
		
		for(int index = 0; index < arr.length; index++){
			arr[index] = getUpperLowerCase(arr[index]);
		}
		System.out.println("Converted string is: "+ Arrays.toString(arr));
	}
	
	public static void main(String[] args){
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		new Ass48ConvertCase().convCase(input);
	}
	
}