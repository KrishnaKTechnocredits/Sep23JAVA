/*Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/

package onkar;

import java.util.Arrays;

public class Assignment36 {
	
	void swapElements (String[] arr) {
		int lastElement = arr.length;
		String temp = arr[0];
		arr[0] = arr[lastElement-1];
		arr[lastElement-1] = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh"};
		assignment36.swapElements(input);
	}
}
