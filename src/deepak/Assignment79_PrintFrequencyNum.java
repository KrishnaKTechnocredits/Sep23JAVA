/*Assignment-79 : 3rd Nov'2023

Write a program to print freq of each number using ArrayList.

input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1
*/

package deepak;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79_PrintFrequencyNum{
	
	void printNumFreq(ArrayList<Integer> input){
		System.out.println("Input : "+input);
		System.out.println("Output : ");		
		while(input.size() > 0){
			int oSize = input.size();
			Integer temp = input.get(Integer.valueOf(0));
			while(input.contains(temp)){
				input.remove(temp);
			}
			int nSize = input.size();
			System.out.println(temp+" -> "+(oSize - nSize));
		}
	}
	
	public static void main(String[] args){
		Assignment79_PrintFrequencyNum output = new Assignment79_PrintFrequencyNum();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10,20,10,10,11,11,13));
		output.printNumFreq(input);
	}
}
