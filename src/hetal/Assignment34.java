package hetal;

public class Assignment34 {

	void printSumEvenNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum = sum + arr[index];
			}
		}
		System.out.println("sum of all the even numbers from given input is " + sum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 44, 33, 23 };
		Assignment34 assignment34 = new Assignment34();
		assignment34.printSumEvenNum(input);
	}
}
