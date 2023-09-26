/*
 * Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 */

package shamli.array;
import java.util.Arrays;

public class Assignment36 {
	
	void swapFirstAndLastElementOfArray(String[] arr) {
		System.out.println("Before :"+Arrays.toString(arr));
		String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println("After :"+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Assignment36 assignment36=new Assignment36();
		String input[]=  { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment36.swapFirstAndLastElementOfArray(input);
	}
}
