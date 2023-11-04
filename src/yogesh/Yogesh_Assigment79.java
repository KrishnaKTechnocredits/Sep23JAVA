//Assignment-79 : 3rd Nov'2023
//
//Write a program to print freq of each number using ArrayList.
//
//input : {10,20,10,10,11,11,13}
//output : 10 -> 3
//         20 -> 1
//		 11 -> 2
//		 13 -> 1

package yogesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Yogesh_Assigment79 {

	void freqOfEachNumber(ArrayList<Integer> num) {

		while (num.size() > 0) {
			Integer currentNum = num.get(0);
			Integer count = 0;
			while (num.contains(currentNum)) {
				num.remove(currentNum);
				count++;
			}
			System.out.println(currentNum + " --> " + count);
		}

	}

	public static void main(String[] args) {
		Yogesh_Assigment79 assigment79 = new Yogesh_Assigment79();
		Integer[] input = { 10, 20, 10, 10, 11, 11, 13 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		assigment79.freqOfEachNumber(al);
	}

}
