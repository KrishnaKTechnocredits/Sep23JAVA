/*
Assignment-74 : 1st Nov'2023

return the list of all the prime numbers in a give list.

boolean isPrime(int num){
}
ArrayList<Integer> getPrimeList(ArrayList<Integer> listOfNumber){}
*/

package deepak;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment74_PrimeNumList {
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
		System.out.println("Input : " + input);
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

	void userInputNumbers() {
		ArrayList<Integer> input = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("-----USER INPUT-----");
		System.out.println("For how many numbers, do you want to check if it is prime or not?");
		int total = sc.nextInt();
		System.out.println("Enter the numbers");
		for (int index = 1; index <= total; index++) {
			int num = sc.nextInt();
			input.add(num);
		}
		System.out.println("Output2 : " + getPrimeNumList(input));
	}

	public static void main(String[] args) {
		Assignment74_PrimeNumList output = new Assignment74_PrimeNumList();
		ArrayList<Integer> input = new ArrayList<>();
		input.add(20);
		input.add(6);
		input.add(5);
		input.add(13);
		input.add(33);
		input.add(17);
		input.add(35);
		input.add(239);
		input.add(79);
		System.out.println("Output : " + output.getPrimeNumList(input));
		output.userInputNumbers();

	}
}
