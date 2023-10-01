/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
*/
package roshani;

import java.util.Arrays;

public class Assignment36{
	
	void swapArray(String[] input){
		System.out.println("Before -->" + Arrays.toString(input));
		String temp = "";
		temp = input[0];
		input[0] = input[input.length-1];
		input[input.length-1] = temp;
		System.out.println("After -->" + Arrays.toString(input));
	}
	
	public static void main(String[] args){
		String[] ArrInput = { "Sayli", "deepak", "Nivedita", "Yogesh"};
		Assignment36 assignment36 = new Assignment36();
		assignment36.swapArray(ArrInput);
	}
}