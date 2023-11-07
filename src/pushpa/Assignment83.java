//Assignment-83 : 5th Nov'2023
//Return freq of each character in a given String.
//
//input : technocredits
//output : {t,2},{e,2},........

package pushpa;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Assignment83 {

	public HashMap<Character, Integer> countFreqOfLetter(String str) {
		HashMap<Character, Integer> hashMapChars = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hashMapChars.containsKey(ch)) {
				int count = hashMapChars.get(ch);
				hashMapChars.put(ch, count + 1);
			} else {
				hashMapChars.put(ch, 1);
			}
		}
		return hashMapChars;

	}

	public static void main(String[] args) {
		HashMap<Character, Integer> hashMapChars = new Assignment83().countFreqOfLetter("technocredits");
		System.out.println(hashMapChars);
	}
}
