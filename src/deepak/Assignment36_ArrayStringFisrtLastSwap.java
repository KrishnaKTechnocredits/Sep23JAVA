/*
 * Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 */
package deepak;

import java.util.Arrays;

public class Assignment36_ArrayStringFisrtLastSwap {
	
	String[] getSwappedString(String[] input){
		System.out.println("Input: "+Arrays.toString(input));
		int inputLen = input.length;
		String temp = input[0];
		input[0] = input[inputLen-1];
		input[inputLen-1] = temp;
		return input;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_ArrayStringFisrtLastSwap getSwap = new Assignment36_ArrayStringFisrtLastSwap();
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh"};
		System.out.println("Output: "+Arrays.toString(getSwap.getSwappedString(arr)));
	}

}
