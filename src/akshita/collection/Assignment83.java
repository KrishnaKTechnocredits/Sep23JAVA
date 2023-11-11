/* Return freq of each character in a given String.
input : technocredits
output : {t,2},{e,2},........ */

package akshita.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment83 {

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("Input : " + str);
		Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (hm.containsKey(ch)) {
				int count = hm.get(ch);
				hm.put(ch, count + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println("Output : " + hm);
	}
}
