/* Print sum of all the even numbers from given array.
input : {10,11,44,33,23} 
output : 54 */

package sayali;

public class Assignment33 {

	int getSumOfEvenNumbers(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum += arr[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 44, 33, 23 };
		Assignment33 assignment33 = new Assignment33();
		int result = assignment33.getSumOfEvenNumbers(input);
		System.out.println("Sum of all even numbers -> " + result);
	}
}