package technoCredits.interview;

import java.util.TreeMap;
import java.util.TreeSet;

public class TestYourKnowledge {
	
	public static void main(String[] args) {
		TreeMap<StringBuilder, Integer> tm = new TreeMap<StringBuilder, Integer>();
		tm.put(new StringBuilder("Maulik"), 11);
		tm.put(new StringBuilder("Harsh"), 3);
		tm.put(new StringBuilder("Krishna"), 2);
		tm.put(new StringBuilder("Margi"), 4);

		System.out.println(tm);
		
		TreeSet<StringBuilder> ts = new TreeSet<StringBuilder>();
		ts.add(new StringBuilder("Maulik"));
		ts.add(new StringBuilder("Harsh"));
		ts.add(new StringBuilder("Krishna"));
		ts.add(new StringBuilder("Margi"));

		System.out.println(ts);
	}
}
