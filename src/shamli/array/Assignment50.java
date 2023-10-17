/*
 * Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89
 */

package shamli.array;
import java.util.Arrays;

public class Assignment50 {
	
	void processArray(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Sorted Array is:"+Arrays.toString(arr));
		System.out.println("Second Max number from Array is :"+arr[arr.length-2]);
	}

	public static void main(String[] args) {
		Assignment50 assignment50=new Assignment50();
		int[] age = {13,45,2,48,89,11,19,91};
		System.out.println("Input array :"+Arrays.toString(age));
		assignment50.processArray(age);
	}
}
