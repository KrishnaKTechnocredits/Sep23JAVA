/*
 Assignment-83 : 5th Nov'2023
Return freq of each character in a given String.

input : technocredits
output : {t,2},{e,2},........
 */

package jyoti_CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment83 {

	Map<Character, Integer> getFrequency(String str) {
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
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
		System.out.println(ass.getFrequency(str));
	}
}
