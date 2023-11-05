package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Example27 {
	
	public static void main(String[] args) {
		Integer[] arr = {10,11,10,44,55,4,55,66,67};
		
		List<Integer> al1 = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(arr));
		
		System.out.println(al1);
		System.out.println(lhs);
		al1.removeAll(lhs);
		
		System.out.println(al1); //
	}
}
