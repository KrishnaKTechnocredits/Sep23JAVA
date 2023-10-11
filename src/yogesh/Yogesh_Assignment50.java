//Assignment - 50 : 8th Oct'2023
//Find the second max from given array.
//int[] age = {13,45,2,48,89,11,19,91};
//output : 89
package yogesh;

public class Yogesh_Assignment50 {

	int secMax(int[] arr) {
		int max1 = arr[0];
		int max2 = arr[1];
		if (max1 < max2) {
			int temp = max1;
			max1 = max2;
			max2 = temp;
		}
		for (int index = 2; index < arr.length; index++) {
			if (arr[index] > max1) {
				max2 = max1;
				max1 = arr[index];
			} else if (arr[index] > max2 && arr[index] != max1) {
				max2 = arr[index];
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		int[] age = { 13, 45, 2, 48, 89, 11, 19, 91 };
		Yogesh_Assignment50 assignment50 = new Yogesh_Assignment50();
		int output = assignment50.secMax(age);
		System.out.println("Second max number is:--" + output);
	}
}
