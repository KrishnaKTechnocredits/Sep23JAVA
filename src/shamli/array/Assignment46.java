/*
 * Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : J6a6y -> 12
 */

package shamli.array;

import java.util.Arrays;

public class Assignment46 {
	
	void processArray(String[] input) {
		String maxName="";
		int maxSum=0;
		int sum=0;
		for(int index=0;index<input.length;index++) {
			sum=getDigitSum(input[index]);
			if(maxSum<sum) {
				maxSum=sum;
				maxName=input[index];
			}
		}
		System.out.println("Name having maximum digit sum is :" +maxName+"-> "+maxSum);
	}
	
	int getDigitSum(String str) {
		int digitSum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				digitSum=digitSum+Character.getNumericValue(ch);
			}
		}
		return digitSum;
	}

	public static void main(String[] args) {
		Assignment46 assignment46=new Assignment46();
		String[] input=new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Before Array :"+Arrays.toString(input));
		assignment46.processArray(input);

	}

}
