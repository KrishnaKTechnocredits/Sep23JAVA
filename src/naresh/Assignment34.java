package naresh;

public class Assignment34 {
	int evenSum = 0;
	int oddSum = 0;
	int sum;

	int display(int[] input) {

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenSum = evenSum + input[index];
			else if (input[index] % 2 != 0) {
				oddSum = oddSum + input[index];
			}

			if (evenSum > oddSum) {
				sum = evenSum - oddSum;
			} else if (evenSum < oddSum) {
				sum = oddSum - evenSum;
			}

		}

		return sum;
	}

	public static void main(String[] args) {

		Assignment34 a = new Assignment34();
		int[] num = { 10, 3, 44, 33, 35 };
		int differenceOfSum = a.display(num);
		System.out.println(differenceOfSum);

	}

}
/*
 * Assignment-33 : 26th Sep'2023
 * 
 * Print sum of all the even numbers from given array. input : {10,11,44,33,23}
 * output : 54
 * 
 * Assignment-34 : 26th Sep'2023 Return positive difference of sum of all the
 * even numbers and odd numbers from given array. input : {10,3,44,33,35} output
 * : 17
 * 
 * Assignment-35 : 26th Sep'2023 Print name and its first letter from given
 * array. input : { "Sayli", "deepak", "Nivedita", "Yogesh" } output : Sayli ->
 * S deepak -> d Nivedita -> N Yogesh -> Y
 * 
 * Assignment-36 : 26th Sep'2023 Swap first and last element of an array, print
 * it to confirm swap operation. input : { "Sayli", "deepak", "Nivedita",
 * "Yogesh"} output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 */

