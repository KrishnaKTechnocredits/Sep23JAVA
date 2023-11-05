/*Return all duplicate number from all given numbers in appropriate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]*/

package gaurang;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
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
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int index = 0 ; index<al.size() ;index++ ) {
			Integer x = al.get(index);
			if(!set.add(x)) {
				al1.add(x);
			}
		}
		System.out.println(al1);
	}
}
