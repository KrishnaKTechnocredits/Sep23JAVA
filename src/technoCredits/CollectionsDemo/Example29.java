package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Example29 {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> listOfName = new
		 * ArrayList<>(Arrays.asList("Shrutika","Swati","Onkar","Jay"));
		 * System.out.println(listOfName);
		 * 
		 * Collections.sort(listOfName); System.out.println(listOfName);
		 * Collections.sort(listOfName, Collections.reverseOrder());
		 * System.out.println(listOfName);
		 * 
		 * System.out.println();
		 */
		
		TreeSet<String> setOfName = new TreeSet<>(Collections.reverseOrder());
		setOfName.add("Shrutika");
		setOfName.add("Swati");
		setOfName.add("Onkar");
		setOfName.add("Jay");
		
		TreeSet<Integer> setOfNum = new TreeSet<>(Collections.reverseOrder());
		setOfNum.add(13);
		setOfNum.add(29);
		setOfNum.add(19);
		setOfNum.add(28);
		
		System.out.println(setOfNum);
	}
}
