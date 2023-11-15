/* return list of all the unique (having freq =1) words  from given String.
input : "hello techno techno hi credits hi techno hello techno pune"
output : {hi=2, credits=1, techno=4, hello=2, pune=1} */

package akshita.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86 {

	Map<String, Integer> frequency() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Input : " + str);
		String[] input = str.split(" ");
		for (String output : input) {
			if (hm.containsKey(output)) {
				hm.put(output, hm.get(output) + 1);
			} else
				hm.put(output, 1);
		}
		return hm;
	}

	void uniqueFreq() {
		List<String> ls = new LinkedList<String>();
		Map<String, Integer> hm = frequency();
		Set<String> str = hm.keySet();
		for (String input : str) {
			if (hm.get(input) == 1) {
				ls.add(input);
			}
		}
		System.out.println("Output : " + ls);
	}

	public static void main(String[] args) {
		new Assignment86().uniqueFreq();
	}
}
