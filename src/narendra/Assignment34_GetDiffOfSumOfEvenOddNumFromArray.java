/*
Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17

*/
package narendra;

public class Assignment34_GetDiffOfSumOfEvenOddNumFromArray {
	int toPrintDiffOfSumOfEvenOddNum(int[] inputArray) {
		int sumOfEvenNum = 0;
		int sumOfOddNum = 0;
		int diffOfEvenOddNum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] % 2 == 0) {
				sumOfEvenNum += inputArray[index];
			} else if (inputArray[index] % 2 != 0) {
				sumOfOddNum += inputArray[index];
			}
		}
		if (sumOfEvenNum > sumOfOddNum) {
			diffOfEvenOddNum = sumOfEvenNum - sumOfOddNum;
//			System.out.println("diff of sum of even and odd num is: " + diffOfEvenOddNum);
		} else {
			diffOfEvenOddNum = sumOfOddNum - sumOfEvenNum;
//			System.out.println("diff of sum of even and odd num is: " + diffOfEvenOddNum);
		}
		return diffOfEvenOddNum;

	}

	public static void main(String[] args) {
		int[] arrayValue = { 10, 3, 44, 33, 35 };
		Assignment34_GetDiffOfSumOfEvenOddNumFromArray printdiffofevenoddnum = new Assignment34_GetDiffOfSumOfEvenOddNumFromArray();
		int output = printdiffofevenoddnum.toPrintDiffOfSumOfEvenOddNum(arrayValue);
		System.out.println("diff of sum of even and odd num is: " + output);

	}

}
