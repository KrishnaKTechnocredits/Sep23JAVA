//Assignment-74 : 1st Nov'2023
//
//return the list of all the prime numbers in a give list.
//
//
//boolean isPrime(int num){
//
//}
//
//ArrayList<Integer> getPrimeList(ArrayList<Integer> listOfNumber){
//	
//}

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment74 {
	
	public boolean isPrimeNumber(int no) {
		for (int i = 2; i < no / 2; i++) {
			if (no % i == 0)
				return false;

		}
		return true;
	}

	public ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> arrayList) {
		System.out.println(arrayList);
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			int index = arrayList.get(i);
			boolean result = isPrimeNumber(index);
			if (result) {
				primeNumbersList.add(index);
			}
		}
		return primeNumbersList;
	}

	public static void main(String[] args) {
		Assignment74 assignment74 = new Assignment74();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(13);
		arrayList.add(7);
		arrayList.add(5);
		arrayList.add(24);
		arrayList.add(14);
		arrayList.add(55);
		arrayList.add(44);
		arrayList.add(12);
		arrayList.add(3);
		ArrayList<Integer> primeNumbersList = assignment74.getPrimeNumbers(arrayList);
		System.out.println(primeNumbersList);
	}
}
