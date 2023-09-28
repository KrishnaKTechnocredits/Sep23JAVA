/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17*/

package rahul;

public class Assignment34_1 {
	int evenSum;
	int oddSum;

	int evenAdditionAndOddAddition(int input[]) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenSum = evenSum + input[index];
			} else {
				oddSum = oddSum + input[index];
			}
		}
		int ans = getDifference(evenSum, oddSum);
		return ans;
	}

	int getDifference(int eSum, int oSum) {
		int outputSum = 0;
		if (eSum > oSum) {
			outputSum = eSum - oSum;
		} else if (oSum > eSum) {
			outputSum = oSum - eSum;
		} else if (eSum == oSum) {
			System.out.println("Addition of even and odd is same hence cannot find sum");
		}
		return outputSum;
	}

	public static void main(String args[]) {
		Assignment34_1 assignment34_1 = new Assignment34_1();
		int arr[] = { 10, 3, 44, 33, 35 };
		int diffAns = assignment34_1.evenAdditionAndOddAddition(arr);
		System.out.println("Difference is: " + diffAns);
		System.out.println("------------------------------");
		Assignment34_1 assignment34_2 = new Assignment34_1();
		int arr1[] = { 10, 10, 3, 17 };
		int diffAns1 = assignment34_2.evenAdditionAndOddAddition(arr1);
		System.out.println("Difference is: " + diffAns1);
	}
}
