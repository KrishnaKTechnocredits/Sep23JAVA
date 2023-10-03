/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
*/
package roshani;

public class Assignment34{
	
	int getSumOfArray(int[] arr){
		int evenSum = 0;
		int oddSum = 0;
		int diff = 0;
		for (int index = 0; index < arr.length ; index++){
			if(arr[index]%2==0){
				evenSum = evenSum + arr[index];
			}else {
				//System.out.println(arr[index]);
				oddSum = oddSum + arr[index];
			}
		}
		if(evenSum>oddSum){
			diff = evenSum-oddSum;
		}else{
			diff = oddSum-evenSum;
		}
		return diff;		
	}
	
	public static void main(String[] args){
		int[] input = {10,3,44,33,35};
		Assignment34 assignment34 = new Assignment34();
		int result = assignment34.getSumOfArray(input);
		System.out.println("Difference of sum of all the even numbers and odd numbers from given array is : " + result);
	}
}