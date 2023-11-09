/*
 Assignment-87 : 5th Nov'2023
Return the word having Maximum frequecy.
Map<String,Integer> processWordMap(String str){
}
String getMaxWordFreq(Map<String,Integer> mapOfWords){
}
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno
 */

package jyoti_CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment87 {
	Map<String, Integer> processWordMap(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
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
		return maxWordFrq;

	}

	public static void main(String[] args) {
		Assignment87 ass = new Assignment87();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		String[] arr = str.split(" ");
		System.out.println("Original String-->" + str);
		System.out.println("=============================");
		System.out.println("Maximum frequency words in the Original String are-->");
		System.out.println(ass.getMaxWordFreq(ass.processWordMap(str)));
	}

}
