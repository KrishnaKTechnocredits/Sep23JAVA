//Return unique set of number from all given numbers.

package aditya.Collection;

import java.util.*;

public class Assignment81 {

	public static void main(String[] args) {
		Integer arr[] = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		List<Integer> listOfNumbers = Arrays.asList(arr);
		LinkedHashSet<Integer> SetOfNumbers = new LinkedHashSet<Integer>(listOfNumbers);
		System.out.println(SetOfNumbers);
	}

}