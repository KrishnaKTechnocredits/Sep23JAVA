/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package mohit;

public class Assignment_33 {
	int getSumOfEvenArray(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum = sum + input[index];
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 44, 33, 23 };
		Assignment_33 assignment_33 = new Assignment_33();
		int result = assignment_33.getSumOfEvenArray(input);
		System.out.println("The sum of even numbers in given array is " + result);

	}

}
