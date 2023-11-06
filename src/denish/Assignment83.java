/*Assignment-83 : 5th Nov'2023
Return freq of each character in a given String.

input : technocredits
output : {t,2},{e,2},........*/
package denish;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment83 {

	Map<Character, Integer> getCharFreq(String input) {
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		return charMap;
	}

	public static void main(String[] args) {
		String str = "technocredits";
		Assignment83 ass = new Assignment83();
		System.out.println(ass.getCharFreq(str));
	}
}
