/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
			n[0]	n[1]  n[2]  n[3]
			temp=n[0]
			n[3]=n[0]
			temp=n[3]
*/
package jyoti;

import java.util.Arrays;

public class Assignment36 {

	void printSwap(String[] names) {
		String temp = names[0];
		names[0] = names[names.length - 1];
		names[names.length - 1] = temp;
		System.out.print(Arrays.toString(names));

	}

	public static void main(String[] args) {
		Assignment36 as = new Assignment36();
		String[] names = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		as.printSwap(names);
	}

}
