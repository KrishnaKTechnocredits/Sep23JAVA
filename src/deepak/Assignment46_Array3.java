/*
 * /*
Assignment - 46 : 8th Oct'2023

Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12
*/
package deepak;

import java.util.Arrays;

public class Assignment46_Array3{
	int getSum(String input){
		int sum = 0;
		for(int index = 0 ; index < input.length() ; index++){
			char ch  = input.charAt(index);
			if(Character.isDigit(ch)){
				sum = sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	void getMaxSumString(String[] input){
		System.out.println("Input : "+Arrays.toString(input));
		int temp = 0;
		String maxSum = "";
		for(int index = 0 ; index < input.length ; index++){
			int sum = getSum(input[index]);
			if(temp < sum){
				temp = sum;
				maxSum = input[index];
			}
		}
		System.out.println("Output: "+maxSum+" -> "+temp);
	}
	
	public static void main(String[] args) {
		Assignment46_Array3 output = new Assignment46_Array3();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		output.getMaxSumString(input);
	}
}
