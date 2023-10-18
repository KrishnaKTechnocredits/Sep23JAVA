//Assignment - 46 : 8th Oct'2023
//Print the name having maximum digit sum from given array.
//String[] input = new String[4];
//		input[0] = "sak2s4hi9";
//		input[1] = "9De9e3pak3";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//output : 9De9e3pak3 -> 24
package sakshi;

import java.util.Arrays;
public class Assignment46{
	
	int getSumString(String strName){
		int sum=0;
		for(int index=0; index<strName.length(); index++){
			char ch = strName.charAt(index);
			if(Character.isDigit(ch)){
				sum=sum+Character.getNumericValue(ch);
			}
		}
	    return sum;
	}
	
	void getStringFromArray(String[] input){
		int tempSum=0;
		String maxSumString = "";
		for(int index=0; index<input.length; index++){
			int sum = getSumString(input[index]);
			if(sum>tempSum){
				tempSum=sum;
				maxSumString = input[index];
			}
		}
		System.out.println(maxSumString + " has maximum sum " +tempSum);
	}
	
	public static void main(String[] args){
		Assignment46 assignment46 = new Assignment46();
		String[] input = {"sak2s4hi9", "9De9e3pak3","J6a6y","cred5it2s"};
		assignment46.getStringFromArray(input);
	}
}