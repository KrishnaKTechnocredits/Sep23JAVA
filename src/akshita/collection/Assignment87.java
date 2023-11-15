/* Return the word having Maximum frequecy.
 input : "hello techno techno hi credits hi techno hello techno pune"
output : techno*/

package akshita.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment87 {

	Map<String, Integer> frequency() {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String input = "hello techno techno hi credits hi techno hello techno pune";
		String[] str = input.split(" ");
		System.out.println("Input : " + Arrays.toString(str));
		for (String output : str) {
			if (hm.containsKey(output)) {
				hm.put(output, hm.get(output) + 1);
			} else
				hm.put(output, 1);
		}
		return hm;
	}

	void maxFreq() {
		int max = 0;
		String maxChar = "";
		Map<String, Integer> hm = frequency();
		Set<String> str = hm.keySet();
		for (String input : str) {
			if (hm.get(input) > max) {
				max = hm.get(input);
				maxChar = input;
			}
		}
		System.out.println("Output : " + maxChar);
	}

	public static void main(String[] args) {
		new Assignment87().maxFreq();
	}
}
