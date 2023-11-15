/*Write a program to print freq of each number using ArrayList.

input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1*/

package onkar;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {
	
	void printFrequency (ArrayList<Integer> listOfNumbers) {
		while(listOfNumbers.size()!=0) {
			int startLen = listOfNumbers.size();
			Integer num = listOfNumbers.get(0);
			while (listOfNumbers.contains(num))
				listOfNumbers.remove(num);
			int endLen = listOfNumbers.size();
			System.out.println(num+" -> "+(startLen - endLen));
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,20,10,10,11,11,13};  
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(arr));
		new Assignment79().printFrequency(listOfNumbers);
	}
}
