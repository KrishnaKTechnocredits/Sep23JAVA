/*all Assignment-33 : 26th Sep'2023 Print sum of all the even numbers from given array.
input : {10,11,44,33,23} 
output : 54*/

package swati;

public class Ass33PrintSumOfAllNumbers {

	int getSumOfNumbers(int[] arr) {
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
		Ass33PrintSumOfAllNumbers ass33PrintSumOfAllNumbers = new Ass33PrintSumOfAllNumbers();
		int result = ass33PrintSumOfAllNumbers.getSumOfNumbers(input);
		System.out.println("Sum of all even numbers -> " + result);
	}
}
