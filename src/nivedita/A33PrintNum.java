/*
Assignment-33 : 26th Sep'2023
Print sum of all the even numbers from given array.
input : {10,11,44,33,23}
output : 54
*/

package nivedita;

public class A33PrintNum {

	public void printSum() {
		int[] arr = { 10, 11, 44, 33, 23 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sum += arr[i];
		}
		System.out.println("Sum of Even numbers is : " + sum);
	}

	public static void main(String[] args) {
		A33PrintNum printNum = new A33PrintNum();
		printNum.printSum();
	}
}