//Assignment-81 : 4th Nov'2023
//
//Return unique set of number from all given numbers.
//
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,11,44,55,4,66,67]

package pushpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment81 {

	public Set<Integer> getUniqueNumber(List<Integer> arrayList) {
		Set<Integer> uniqueNos = new LinkedHashSet<Integer>();
		for (int i = 0; i < arrayList.size(); i++) {
			uniqueNos.add(arrayList.get(i));
		}
		return uniqueNos;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67));
		System.out.println(arrayList);
		Set<Integer> uniqueNos = new Assignment81().getUniqueNumber(arrayList);
		System.out.println(uniqueNos);
	}
}
