/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17*/


package mohit;

public class Assignment_34 {
	int getPosDiffOfEvenAndOddInArray(int[] input) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenSum = evenSum + input[index];
			} else {
				oddSum = oddSum + input[index];
			}

		}
		if (evenSum > oddSum) {
			return evenSum - oddSum;
		} else {
			return oddSum - evenSum;
		}

	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment_34 assignment_34 = new Assignment_34();
		int result = assignment_34.getPosDiffOfEvenAndOddInArray(input);
		System.out.println("The positive difference of sum of even and odd numbers in array is " + result);

	}

}
