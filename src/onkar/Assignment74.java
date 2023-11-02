/*return the list of all the prime numbers in a give list.
*/

package onkar;

import java.util.ArrayList;

public class Assignment74 {
	
	ArrayList<Integer> findPrimeNum (ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index=0; index<input.size(); index++) {
			boolean flag = isPrime(input.get(index));
			if (flag) {
				output.add(input.get(index));
			}
		}
		return  output;
	}
	
	boolean isPrime(int num) {
		boolean flag = true;
		for (int index=2; index<=Math.sqrt(num); index++) {
			if(num%index == 0)
				flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		arr.add(12);
		arr.add(15);
		arr.add(27);
		arr.add(29);
		System.out.println("Input ArrayList is : "+arr);
		System.out.println("Prime numbers from the given ArrayList are : "+new Assignment74().findPrimeNum(arr));
	}
}
