/*Assignment-79 : 3rd Nov'2023

Write a program to print freq of each number using ArrayList.

input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1
*/

package roshani;

import java.util.ArrayList;
import java.util.Arrays;

public class Ass79FreqOfNoArrayList {
	void printFreq(ArrayList<Integer> numList) {
		
		while(numList.size() > 0) {
			int num = numList.get(0);
			int orgSize = numList.size();
			
			while(numList.contains(num)) {
				numList.remove(Integer.valueOf(num));
			}
			int newSize = numList.size();
			System.out.println("Freq of Num " + num + " is --> "+ (orgSize-newSize));	
		}
	}
	
	public static void main(String[] args) {
		Ass79FreqOfNoArrayList assignment79 = new Ass79FreqOfNoArrayList();
		Integer[] input = {10,20,10,10,11,11,13};
		ArrayList<Integer> listNum = new ArrayList<Integer>(Arrays.asList(input));
		assignment79.printFreq(listNum);
	}
}
