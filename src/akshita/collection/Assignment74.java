/*return the list of all the prime numbers in a give list. */

package akshita.collection;

import java.util.ArrayList;

public class Assignment74 {
	
   void prime(ArrayList<Integer> input1) {
	    ArrayList<Integer> output = new ArrayList<Integer>();
		for(int Index=0;Index<input1.size();Index++) {
			int input = input1.get(Index);
			 boolean flag =true;
			for(int index=2;index<=input/2;index++) {
				if(input% index ==0) {
					flag= false;
					break;
				}	
			}
			if(flag) {
					output.add(input);
				}
		}
		System.out.println("Prime number : " +output);
	}

	public static void main(String[] args) {
		Assignment74 ass74 = new Assignment74();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(16);
		al.add(14);
		al.add(17);
		al.add(19);
		al.add(22);
		al.add(23);
		System.out.println("Input : " + al);
		ass74.prime(al);
	}
}
