package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Example25 {

	public static void main(String[] args) {
		Set<Object> setOfNames = new TreeSet<Object>();
		setOfNames.add("1Shrutika");
		setOfNames.add("Denish");
		setOfNames.add("Rahul");
		setOfNames.add("Jay");
		setOfNames.add("Jyoti");
		setOfNames.add("Denish");
		setOfNames.add("Gaurang");
		setOfNames.add("Raj");
		setOfNames.add("10"); //49
		
		System.out.println(setOfNames);
		setOfNames.remove("10");
		System.out.println(setOfNames);
		ArrayList<Object> al = new ArrayList<Object>(setOfNames);
		System.out.println("First : " + al.get(0));
		System.out.println("Last : " + al.get(al.size()-3));
	}
}
