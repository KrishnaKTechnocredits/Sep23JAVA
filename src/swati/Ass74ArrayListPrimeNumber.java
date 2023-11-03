/*Assignment-74 : 1st Nov'2023 return the list of all the prime numbers in a give
 *  list. boolean isPrime(int num){ } 
ArrayList<Integer> getPrimeList(ArrayList<Integer> listOfNumber){ 	 }*/
package swati;

import java.util.ArrayList;

public class Ass74ArrayListPrimeNumber {

	boolean isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				flag = false;
		}
		return flag;
	}

	ArrayList<Integer> findPrimeNumber(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			boolean flag = isPrime(input.get(index));
			if (flag) {
				output.add(input.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(2);
		intlist.add(7);
		intlist.add(5);
		intlist.add(11);
		intlist.add(9);
		intlist.add(12);
		intlist.add(83);
		intlist.add(53);
		intlist.add(97);
		ArrayList<Integer> outputArraylist = new Ass74ArrayListPrimeNumber().findPrimeNumber(intlist);
		System.out.println("Input: " + intlist);
		System.out.println("Prime Numbers: " + outputArraylist);
	}
}
