/*Assignment-79 : 3rd Nov'2023
Write a program to print freq of each number using ArrayList.
input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1*/

package jaykumar;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {
	
	void freqNum(ArrayList<Integer> listOfNum) {
		System.out.println("Given list of Num: "+listOfNum);
		while(listOfNum.size()!=0) {
			int oldLen = listOfNum.size();
			Integer num = listOfNum.get(0);
			while(listOfNum.contains(num)) {
				listOfNum.remove(num);
			}
			int newLen = listOfNum.size();
			System.out.println(num+" -> "+(oldLen-newLen));
		}
	}

	
	public static void main(String[] args) {
		Integer[] numArr = {10,20,10,10,11,11,13};
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		new Assignment79().freqNum(listOfNum);
	}
}
