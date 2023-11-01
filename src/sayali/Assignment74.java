/* WAP to return the list of all the prime numbers in a given list. */

package sayali;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment74 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				flag = false;
		}
		return flag;
	}

	ArrayList<Integer> getPrimeNumList(ArrayList<Integer> input) {
		boolean flag = false;
		System.out.println("\nInput is : " + input);
		ArrayList<Integer> output = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			int num = input.get(index);
			flag = isPrime(num);
			if (flag) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {

		Assignment74 ass74 = new Assignment74();
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to check if it is prime or not?");
		int count = sc.nextInt();
		System.out.println("Please Enter number: ");
		for (int index = 1; index <= count; index++) {
			int num = sc.nextInt();
			input.add(num);
		}
		sc.close();
		System.out.println("\nOutput is : " + ass74.getPrimeNumList(input));
	}
}