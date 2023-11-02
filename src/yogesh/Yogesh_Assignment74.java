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

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment74 {

	boolean isPrime(int num) {
		if (num < 1) {
			return false;
		} else
			for (int index = 2; index < num / 2; index++) {
				if (num % index == 0) {
					return false;
				}
			}
		return true;
	}

	ArrayList<Integer> getPrimeList(ArrayList<Integer> listOfNumber) {
		boolean flag = false;
		ArrayList<Integer> target = new ArrayList<>();
		for (int i = 0; i < listOfNumber.size(); i++) {
			int num = listOfNumber.get(i);
			flag = isPrime(num);
			if (flag) {
				target.add(num);
			}
		}
		return target;
	}

	public static void main(String[] args) {
		Yogesh_Assignment74 assignment74 = new Yogesh_Assignment74();
		ArrayList<Integer> num = new ArrayList<>();
		num.add(13);
		num.add(44);
		num.add(67);
		num.add(51);
		num.add(14);
		num.add(55);
		num.add(-44);
		num.add(11);
		num.add(3);
		System.out.println("For input"+num + " Prime number is " + assignment74.getPrimeList(num));
	}
}
