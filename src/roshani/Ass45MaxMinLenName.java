/*Assignment - 45 : 8th Oct'2023

Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits

*/
package roshani;

public class Ass45MaxMinLenName{
	
	int getLengthOfString(String str){
		return str.length();
	}
	
	void processData(String[] arr){
		
		int maxLength = 0;
		int minLength = 0;
		String maxLengthName = "";
		String minLengthName = "";
		
		for(int index = 0; index < arr.length; index++){
			int length = getLengthOfString(arr[index]);
			if(index == 0){
				maxLength = length;
				minLength = length;
			}else{
				if(length > maxLength){
					maxLength = length;
					maxLengthName = arr[index];
				}else if(length < minLength){
					minLength = length;
					minLengthName = arr[index];
				}
			}	
		}
		System.out.println("Min length name is: " + minLengthName);
		System.out.println("Max length name is: "+ maxLengthName);	
	}
	
	public static void main(String[] args){
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new Ass45MaxMinLenName().processData(input); 
	}
}
		 