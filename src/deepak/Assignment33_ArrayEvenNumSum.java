/*Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54*/

package deepak;

public class Assignment33_ArrayEvenNumSum {
	int sum;

	int getEvenSum(int[] input) {
		System.out.println("Input: ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(+input[index] + " ");
		}
		System.out.println();
		System.out.println("Output: ");
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sum = sum + input[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_ArrayEvenNumSum getSum = new Assignment33_ArrayEvenNumSum();
		int[] arr = { 10, 11, 44, 33, 23 };
		int sum = getSum.getEvenSum(arr);
		System.out.println(sum);
	}

}
