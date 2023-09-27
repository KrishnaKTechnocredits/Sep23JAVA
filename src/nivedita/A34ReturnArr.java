/*
Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
*/

package nivedita;

public class A34ReturnArr {

	public int diffOfNum() {
		int[] arr = { 10, 3, 44, 33, 35 };
		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenSum += arr[i];
			else
				oddSum += arr[i];

		}
		return (evenSum > oddSum ? evenSum - oddSum : oddSum - evenSum);
	}

	public static void main(String[] args) {
		A34ReturnArr returnArr = new A34ReturnArr();
		int result = returnArr.diffOfNum();
		System.out.println("Difference is : " + result);
	}

}