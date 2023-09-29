/*
Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54
 
 */

package narendra;

public class Assignment33_GetSumOfEvenNumFromArray {

	void toPrintSumOfEvenNum(int[] evenNumArray) {
		int sumOfEvenNum = 0;
		for (int index = 0; index < evenNumArray.length; index++) {
			if (evenNumArray[index] % 2 == 0) {
				sumOfEvenNum += evenNumArray[index];
			}
		}
		System.out.println("sum of even numbers from given array is: " + sumOfEvenNum);

	}

	public static void main(String[] args) {
		int inputArray[] = { 10, 11, 44, 33, 23 };
		Assignment33_GetSumOfEvenNumFromArray getsumofevennumfromarray = new Assignment33_GetSumOfEvenNumFromArray();
		getsumofevennumfromarray.toPrintSumOfEvenNum(inputArray);

	}

}
