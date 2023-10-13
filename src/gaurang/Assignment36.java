/*Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/

package gaurang;

import java.util.Arrays;

public class Assignment36 {

	void printSwap(String[] input) {
		String[] output = new String[input.length];
		for(int index=0 ; index<input.length ; index++) {
			String a = input[index];
			if(index==0) {
				output[input.length-1]= a;
			}
			else if (index == input.length-1) {
				output[0] = a;
			}
			else {
				output[index]= a;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment36 a = new Assignment36();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh"};
		a.printSwap(input);
	}
}
