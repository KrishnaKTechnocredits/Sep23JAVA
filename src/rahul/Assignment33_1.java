/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package rahul;

public class Assignment33_1 {

	void evenSum(int input[]) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum = sum + input[index];
			}
		}
		System.out.println("Addition of all even nums: " + sum);
	}

	public static void main(String args[]) {
		Assignment33_1 a3 = new Assignment33_1();
		int arr[] = { 10, 11, 44, 33, 23 };
		a3.evenSum(arr);
	}
}
