//Print sum of all the even numbers from given array.
//input : {10,11,44,33,23}
//output : 54

package pushpa;

public class Assignment33 {

	public void printSumOfEvenNos() {
		int[] arr = { 10, 11, 44, 33, 23 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sum += arr[i];
		}
		System.out.println("Sum of Even numbers in array : " + sum);
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		assignment33.printSumOfEvenNos();
	}

}
