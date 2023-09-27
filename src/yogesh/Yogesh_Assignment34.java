//Assignment-34 :  26th Sep'2023
//Return positive difference of sum of all the even numbers and odd numbers from given array.
//input : {10,3,44,33,35}
//output : 17
package yogesh;

public class Yogesh_Assignment34 {
	int getDiff(int[] input) {
		int output = 0;
		int sum = 0;
		int odd = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum = sum + input[index];
			} else {
				odd = odd + input[index];
			}
			if (sum - odd > 0)
				output = sum - odd;
			else
				output = odd - sum;
		}
		return output;
	}

	public static void main(String[] args) {
		Yogesh_Assignment34 assignment34 = new Yogesh_Assignment34();
		int[] input = { 10, 3, 44, 33, 35 };
		int output = assignment34.getDiff(input);
		System.out.println("Difference is " + output);

	}

}
