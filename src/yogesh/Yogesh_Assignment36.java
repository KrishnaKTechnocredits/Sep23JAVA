//Assignment-36 :  26th Sep'2023
//Swap first and last element of an array, print it to confirm swap operation.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
//output : { "Yogesh", "deepak", "Nivedita","Sayli"}
package yogesh;

import java.util.Arrays;

public class Yogesh_Assignment36 {

	void swapElement(String[] input) {

		String temp = input[0];
		input[0] = input[input.length - 1];
		input[input.length - 1] = temp;
		System.out.println("output-->" + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String[] str = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		System.out.println("input-->" + Arrays.toString(str));
		Yogesh_Assignment36 assignment36 = new Yogesh_Assignment36();
		assignment36.swapElement(str);
	}
}
