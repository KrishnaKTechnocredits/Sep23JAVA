//Assignment - 47 : 8th Oct'2023
//Print the name having maximum digit sum from given array.
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3credits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : ["Rahul", "Technocredits", "Jay", "credits"]	

package sakshi;

import java.util.Arrays;
public class Assignment47{
	
	String getCharactersOnly(String input){
		String output ="";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)){
				output = output + ch;
			}
		}
		return output;
	}
	
	void getStringFromArray(String[] input){
		for(int index=0; index<input.length; index++){
			input[index] = getCharactersOnly(input[index]);
		}
		System.out.println(Arrays.toString(input));
	}
	
	public static void main(String[] args){
		Assignment47 assignment47 = new Assignment47();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment47.getStringFromArray(input);
	}
}

