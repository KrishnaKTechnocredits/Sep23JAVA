/* Return freq of each word in a given String.
input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2} */

package akshita.collection;

import java.util.HashMap;
import java.util.Map;

public class Assignment84 {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		String input = "hello techno techno hi credits hi techno hello techno";
		System.out.println("Input : " + input);
		String[] str = input.split(" ");
		for (String output : str) {
			if (hm.containsKey(output)) {
				hm.put(output, hm.get(output) + 1);
			} else 
				hm.put(output, 1);
		}
		System.out.println("Output: " + hm);
	}
}
