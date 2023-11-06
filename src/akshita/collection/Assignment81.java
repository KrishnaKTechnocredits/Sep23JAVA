/* Return unique set of number from all given numbers.
input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]  */
package akshita.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment81 {

	public static void main(String[] args) {
	Integer[] arr = {10,11,10,44,55,4,55,66,67};	
	HashSet<Integer> hs = new LinkedHashSet<Integer>(Arrays.asList(arr));
	System.out.println("Input : " + Arrays.asList(arr));
	System.out.println("Output : " + hs);
	}
}
