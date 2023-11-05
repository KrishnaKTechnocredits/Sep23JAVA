/* Write a program to print freq of each number using ArrayList.
input : {10,20,10,10,11,11,13}
output : 10 -> 3
         20 -> 1
		 11 -> 2
		 13 -> 1 */

package sayali;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {

	void printNumFrequency(ArrayList<Integer> al1) {
		while (al1.size() > 0) {
			Integer name = al1.get(0);
			int currentLength = al1.size();
			while (al1.contains(name)) {
				al1.remove(name);
			}
			int newLength = al1.size();
			System.out.println(name + " -> " + (currentLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment79 ass79 = new Assignment79();
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(10, 20, 10, 10, 11, 11, 13));
		System.out.println("Output: ");
		ass79.printNumFrequency(input);
	}
}