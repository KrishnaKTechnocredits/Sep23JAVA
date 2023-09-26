package denish;

public class Assignment33 {

	void printSum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum += arr[index];
			}

		}
		System.out.println("Sum of even number -> " + sum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 44, 33, 23 };
		Assignment33 assignment33 = new Assignment33();
		assignment33.printSum(input);
	}
}
