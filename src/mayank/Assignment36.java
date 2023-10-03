//assignment-36 :  26th Sep'2023
//Swap first and last element of an array, print it to confirm swap operation.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
//output : { "Yogesh", "deepak", "Nivedita","Sayli"}
package mayank;

import java.util.Arrays;

public class Assignment36 {
	void swapElement(String[] input) {
		
		String temp = input[0];
		input[0] = input[input.length- 1];
		input[input.length - 1] = temp;
		System.out.println("output-->" + Arrays.toString(input));
	}
	
	public static void main(String[] args) {
		String[] str = {"Sayali","deepak","nivedita","yogesh"};
		System.out.println("input-->" + Arrays.toString(str));
		Assignment36 assignment36 = new Assignment36();
		assignment36.swapElement(str);
	}
	
}
