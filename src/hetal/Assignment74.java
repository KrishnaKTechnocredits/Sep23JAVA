/*return the list of all the prime numbers in a given list.*/


package hetal;

import java.util.ArrayList;

public class Assignment74 {
	
	ArrayList<Integer> getPrimeNum (ArrayList<Integer> input){
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
		for (int index=2; index<=num/2; index++) {
			if(num%index == 0)
				flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(5);
		num.add(13);
		num.add(14);
		num.add(37);
		num.add(16);
		num.add(42);
		System.out.println("input ArrayList : " +num);
		ArrayList<Integer> al = new Assignment74().getPrimeNum(num);
		System.out.println("prime number ArrayList : " +al);
		
	}

}
