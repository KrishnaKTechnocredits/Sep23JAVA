/*Assignment-79 : 3rd Nov'2023 Write a program to print freq of each number
using ArrayList. 
input : {10,20,10,10,11,11,13}
output : 10 -> 3 20 -> 1 11 -> 2 13 -> 1*/
package shrutika;

import java.util.ArrayList;
import java.util.Arrays;

public class As79FreqOfEachNumb {

	void printFreqOfNumber(ArrayList<Integer> input) {
		System.out.println("Input : " + input);
		System.out.println("Output : ");
		while (input.size() > 0) {
			int orgSize = input.size();
			Integer temp = input.get(Integer.valueOf(0));
			while (input.contains(temp)) {
				input.remove(temp);
			}
			int remSize = input.size();
			System.out.println(temp + " -> " + (orgSize - remSize));
		}
	}

	public static void main(String[] args) {
		As79FreqOfEachNumb output = new As79FreqOfEachNumb();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 20, 10, 10, 11, 11, 13));
		output.printFreqOfNumber(input);
	}
}
