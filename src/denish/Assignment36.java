package denish;

import java.util.Arrays;

public class Assignment36 {

	void swapElement(String[] arr) {
		String temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		System.out.println("Array after swap operation -> " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment36 assignment36 = new Assignment36();
		assignment36.swapElement(arr);
	}
}
