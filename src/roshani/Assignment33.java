/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54
*/

package roshani;
public class Assignment33{
	void printSumOfEvenNumbers(int[] arr){
		int evenSum = 0;
		//int oddSum = 0;
		for (int index = 0; index < arr.length ; index++){
			if(arr[index]%2==0){
				evenSum = evenSum + arr[index];
			}
		}
		System.out.println("Sum of even numbers from given array is: " + evenSum);	
	}
	
	public static void main(String[] args){
		int[] input = {10,11,44,33,23};
		Assignment33 assignment33 = new Assignment33();
		assignment33.printSumOfEvenNumbers(input);
	}
}