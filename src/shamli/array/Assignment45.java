/*
 * Assignment - 45 : 8th Oct'2023
Print the name having maximum and minimum length from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits	
 */

package shamli.array;

import java.util.Arrays;

public class Assignment45 {

	void processArray(String[] input) {
		String maxLengthName="";
		String minLengthName="";
		int maxLength=input[0].length();
		int minLength=input[0].length();;
		for(int index=0;index<input.length;index++) {
			int length=input[index].length();
			if(maxLength<length) {
				maxLength=length;
				maxLengthName=input[index];
			}else if(minLength>length) {
				minLength=length;
				minLengthName=input[index];
			}
		}
		System.out.println("Minimum length name is :"+minLengthName);
		System.out.println("Maximum length name is :"+maxLengthName);
	}
	
	public static void main(String[] args) {
		Assignment45 assignment45=new Assignment45();
		String[] input=new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Before Array :"+Arrays.toString(input));
		assignment45.processArray(input);
	}
}
