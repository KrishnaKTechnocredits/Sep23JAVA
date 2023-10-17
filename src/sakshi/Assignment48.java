//Assignment - 48 : 8th Oct'2023
//Convert element case from given array, upper to lower and lower to upper.
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3CRedits";
//	output : ["rAH2U4L", "tECH3NO3crEDITS"]	

package sakshi;

import java.util.Arrays;

public class Assignment48{
	
	String changeCase(String str){
		String output="";
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)){
				output = output + Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)){
				output = output + Character.toUpperCase(ch);
			}else{
				output = output + ch;
			}
		}
		return output;
	}
	
	void getStringFromArray(String[] input){
		for(int index=0; index<input.length; index++){
			input[index] = changeCase(input[index]);
		}
		System.out.println(Arrays.toString(input));
	}
	
	public static void main(String[] args){
		Assignment48 assignment48 = new Assignment48();
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		assignment48.getStringFromArray(input);
	}
}