/*
Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
*/

package nivedita;

import java.util.Arrays;

public class A36SwapArr {

	public void swapElement() {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		System.out.println("Array element before swap : " + Arrays.toString(arr));
		String temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		System.out.println("Array element after swap : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		A36SwapArr swapArr = new A36SwapArr();
		swapArr.swapElement();
	}

}