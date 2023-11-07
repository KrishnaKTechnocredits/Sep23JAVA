//Assignment-82 : 4th Nov'2023
//
//Return all duplicate number from all given numbers in appropiate Data structure.
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,55]

package pushpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment82 {

	public static List<Integer> findDuplicates(List<Integer> arrayList) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (Integer element : arrayList) {
            if (uniqueElements.contains(element)) {
                duplicates.add(element);
            } else {
                uniqueElements.add(element);
            }
        }

        return  duplicates;
    }

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67));
		System.out.println(arrayList);
		List<Integer> uniqueNos = new Assignment82().findDuplicates(arrayList);
		System.out.println(uniqueNos);
	}
}
