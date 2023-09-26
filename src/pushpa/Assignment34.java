//Return positive difference of sum of all the even numbers and odd numbers from given array.
//input : {10,3,44,33,35}
//output : 17

package pushpa;

public class Assignment34 {

	public int diffOfEvenOddNos() {
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
		Assignment34 assignment34 = new Assignment34();
		int result = assignment34.diffOfEvenOddNos();
		System.out.println("Difference is : " + result);
	}

}
