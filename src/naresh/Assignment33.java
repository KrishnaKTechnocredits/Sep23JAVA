package naresh;

public class Assignment33 {
	int printSumOfTheEvenNo(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {

			if (input[index] % 2 == 0)

				sum = sum + input[index];

		}

		return sum;

	}

	public static void main(String[] args) {
		Assignment33 a = new Assignment33();
		int[] num = { 10, 11, 44, 33, 23 };
		int num1 = a.printSumOfTheEvenNo(num);
		System.out.println(num1);
	}

}
