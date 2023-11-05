/*
 Assignment-79 : 3rd Nov'2023

Write a program to print freq of each number using ArrayList.

input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1
 */

package jyoti_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {

	void printNumFrequency(ArrayList<Integer> al) {
		while (al.size() > 0) {
			Integer name = al.get(0);
			int currentLength = al.size();
			while (al.contains(name)) {
				al.remove(name);
			}
			int newLength = al.size();
			System.out.println(name + " -> " + (currentLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment79 ass79 = new Assignment79();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 20, 10, 10, 11, 11, 13));
		System.out.println("Original list-->"+input);
		System.out.println("===============================");
		System.out.println("Output: ");
		ass79.printNumFrequency(input);
	}
}
