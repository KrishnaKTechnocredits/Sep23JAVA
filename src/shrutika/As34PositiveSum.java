/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17 */
package shrutika;

public class As34PositiveSum {

	int getSumOfNum(int[] arrInput) {
		int evenSum = 0;
		int oddSum = 0;
		int diffSum = 0;
		for (int index = 0; index < arrInput.length; index++) {
			if (arrInput[index] % 2 == 0) {
				evenSum = evenSum + arrInput[index];
			} else {
				oddSum = oddSum + arrInput[index];
			}
			if (evenSum > oddSum) {
				diffSum = evenSum - oddSum;
			} else {
				diffSum = oddSum - evenSum;
			}
		}
		return diffSum;
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		As34PositiveSum positiveSumA34 = new As34PositiveSum();
		int output = positiveSumA34.getSumOfNum(input);
		System.out.println(output);
	}
}
