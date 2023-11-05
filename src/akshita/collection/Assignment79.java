/*Write a program to print freq of each number using ArrayList
  input : {10,20,10,10,11,11,13}
output : 10 -> 3*/

package akshita.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {
	
	void freq(ArrayList<Integer> input) {
		while(input.size()!=0) {
			int oLength = input.size();
			Integer temp = input.get(Integer.valueOf(0)); 
			while(input.contains(temp)) {
				input.remove(temp);
			}
			int nLength = input.size();
			System.out.println(temp + "=>" + (oLength-nLength) );
		}
	}

	public static void main(String[] args) {
	Assignment79 ass79 = new Assignment79();
	Integer[] arr = {10,20,10,10,11,11,13};
	ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
	System.out.println("print freq of each number using ArrayList");
    System.out.println("Input : " + al);
    ass79.freq(al);
	}
}
