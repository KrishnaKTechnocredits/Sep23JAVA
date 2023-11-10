/*
 Assignment-88 : 5th Nov'2023
Return the word having Maximum frequecy and its frequecy.

input : "hello techno techno hi credits hi techno hello techno pune"
output : techno-4
 */

package jyoti_CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {

	Map<String, Integer> wordMap(String str) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] arr = str.split(" ");
		for (String word : arr) {

			if (wordMap.containsKey(word)) {
				int count = wordMap.get(word);
				wordMap.put(word, count + 1);

			} else {
				wordMap.put(word, 1);
			}
		}
		return wordMap;

	}

	String getMaxWordFreq(Map<String, Integer> mapOfWords) {
		String maxWordFrq = null;
		int maxFrq = 0;
		Set<String> setOfKeys = mapOfWords.keySet();
		for (String word : setOfKeys) {
			int frq = mapOfWords.get(word);
			if (maxFrq < frq) {
				maxWordFrq = word;
				maxFrq = frq;
			}
		}
		return maxWordFrq + "-->" + maxFrq;

	}

	public static void main(String[] args) {
		Assignment88 ass = new Assignment88();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		String[] arr = str.split(" ");
		System.out.println("Original String is--->");
		System.out.println("=================================");
		System.out.println("Maximum frequency word and its count are-->");
		System.out.println(ass.getMaxWordFreq(ass.wordMap(str)));
	}
}
