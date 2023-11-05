/*Return unique set of number from all given numbers.

input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]*/

package gaurang;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment81 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(10);
		al.add(44);
		al.add(55);
		al.add(4);
		al.add(55);
		al.add(66);
		al.add(67);
		System.out.println(al);
		Set<Integer> set = new LinkedHashSet<Integer>(al);
		System.out.println(set);
	}
}
