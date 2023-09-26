/* Return positive difference of sum of all the even numbers and odd numbers from given array. 
input : {10,3,44,33,35} output : 17 */

package sayali;

public class Assignment34 {

	int printDiffOfSumOfEvenOddNumbers(int[] arr) {
		int evensum = 0;
		int oddsum = 0;
		int positiveDifference = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evensum += arr[index];
			} else {
				oddsum += arr[index];
			}
		}
		if (evensum > oddsum) {
			positiveDifference = evensum - oddsum;
		} else {
			positiveDifference = oddsum - evensum;
		}
		return positiveDifference;
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment34 ass34 = new Assignment34();
		int answer = ass34.printDiffOfSumOfEvenOddNumbers(input);
		System.out.println("Positive Difference of sum of all even numbers and odd numbers is: " + answer);
	}
}