/* Return the word having Maximum frequecy and its frequecy.
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno */

package akshita.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {

	Map<String, Integer> frequency() {
		String input = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Input : " + input);
		String[] str = input.split(" ");
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String input1 : str) {
			if (hm.containsKey(input1)) {
				hm.put(input1, hm.get(input1) + 1);
			} else {
				hm.put(input1, 1);
			}
		}
		return hm;
	}

	void maxFreq() {
		String maxChar = "";
		int max = 0;
		Map<String, Integer> hm = frequency();
		Set<String> str = hm.keySet();
		for (String input : str) {
			if (hm.get(input) > max) {
				max = hm.get(input);
				maxChar = input;
			}
		}
		System.out.println("Output : " + maxChar + " =>  " + max);
	}

	public static void main(String[] args) {
		new Assignment88().maxFreq();
	}
}
