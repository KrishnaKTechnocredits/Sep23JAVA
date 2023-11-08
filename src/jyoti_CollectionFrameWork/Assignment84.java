/*
 Assignment-84 : 5th Nov'2023
Return freq of each word in a given String.

input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2}
 */

package jyoti_CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment84 {

	Map<String, Integer> strFreq(String[] str) {
		Map<String, Integer> strMap = new LinkedHashMap<String, Integer>();

		for (String word : str) {
			if (strMap.containsKey(word)) {
				int count = strMap.get(word);
				strMap.put(word, count + 1);
			} else {
				strMap.put(word, 1);
			}
		}

		return strMap;
	}

	public static void main(String[] args) {
		String str = "hello techno techno hi credits hi techno hello techno";
		Assignment84 ass = new Assignment84();
		String[] input = str.split(" ");
		System.out.println("String is-->" + str);
		System.out.println("Frequency of words are-->" + ass.strFreq(input));
	}

}
