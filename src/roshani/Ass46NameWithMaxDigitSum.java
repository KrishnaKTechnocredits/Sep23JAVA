/*Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12
*/

package roshani;

public class Ass46NameWithMaxDigitSum{
	
	int digitSum(String str){
		int sum = 0;
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	void maxSumName(String[] arr){
		int total = 0;
		String maxSumString = "";
		
		for(int index = 0; index < arr.length; index++){
			int sumOfDigit = digitSum(arr[index]);
			if(sumOfDigit > total){
				total = sumOfDigit;
				maxSumString =arr[index];
			}	
		}
		System.out.println("Name with max digit sum is: " +maxSumString + " -> " + total);
	}
	
	public static void main(String[] args){
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new Ass46NameWithMaxDigitSum().maxSumName(input);
	}
}