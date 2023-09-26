//Swap first and last element of an array, print it to confirm swap operation.
//input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
//output : { "Yogesh", "deepak", "Nivedita","Sayli"}

package pushpa;

import java.util.Arrays;

public class Assignment36 {

	public void swapFirstAndLastElement() {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		System.out.println("Array element before swap first and last element : " + Arrays.toString(arr));
		String temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		System.out.println("Array element after swap first and last element : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.swapFirstAndLastElement();
	}

}
