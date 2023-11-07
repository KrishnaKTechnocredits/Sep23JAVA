/*Assignment-88 : 5th Nov'2023
Return the word having Maximum frequecy and its frequecy.
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno --> 4*/

package jaykumar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {
	
	Map<String, Integer> getWordFreq(String str){
		String[] arr = str.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String word : arr) {
			if(wordMap.containsKey(word)) {
				int count = wordMap.get(word);
				wordMap.put(word, count+1);
			}else {
				wordMap.put(word, 1);
			}
		}
		return wordMap;
	}

	String getMaxFreqWord(Map<String, Integer> wordMap) {
		String maxFreqWord = null;
		int maxFreq = 0;
		Set<String> setOfKeys = wordMap.keySet();
		for(String word : setOfKeys) {
			int freq = wordMap.get(word);
			if(maxFreq<freq) {
				maxFreqWord = word;
				maxFreq = freq;
			}
		}
		return maxFreqWord+" -> "+maxFreq;
	}

	public static void main(String[] args) {
		Assignment88 a = new Assignment88();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Given String: "+str);
		System.out.println("Max frquency word and its frequency in given string: ");
		System.out.println(a.getMaxFreqWord(a.getWordFreq(str)));
	}
}
