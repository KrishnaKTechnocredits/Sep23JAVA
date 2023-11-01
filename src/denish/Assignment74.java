/*Assignment-74 : 1st Nov'2023

return the list of all the prime numbers in a give list.*/
package denish;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment74 {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < Math.sqrt(num); index++) {
			if (num % index == 0)
				flag = false;
		}
		return flag;
	}

	ArrayList<Integer> getPrimeNumList(ArrayList<Integer> input) {
		boolean flag = false;
		System.out.println("Input is : " + input);
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
		Assignment74 ass = new Assignment74();
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("For how many numbers, do you want to check if it is prime or not?");
		int total = sc.nextInt();
		System.out.println("Please Enter Input Here..");
		for (int index = 1; index <= total; index++) {
			int num = sc.nextInt();
			input.add(num);
		}
		System.out.println("Output is : " + ass.getPrimeNumList(input));
	}
}
