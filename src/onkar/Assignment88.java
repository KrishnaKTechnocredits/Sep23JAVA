/*Return the word having Maximum frequecy and its frequecy.

input : "hello techno techno hi credits hi techno hello techno pune"
output : techno->4*/

package onkar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {
	
	Map<String, Integer> findFreq(String input){
		String[] arr = input.split(" ");
		Map<String, Integer> mapOfStringFreq = new LinkedHashMap<String, Integer>();
		for(String word : arr) {
			if(mapOfStringFreq.containsKey(word)) {
				int count = mapOfStringFreq.get(word);
				mapOfStringFreq.put(word, ++count);
			}else {
				mapOfStringFreq.put(word, 1);
			}
		}
		return mapOfStringFreq;
	}
	
	Map<String, Integer> getMaxWordFreq(Map<String, Integer> sortedMap){
		int maxFreq = 0;
		String maxWord = null;
		Set<String> setOfWords = sortedMap.keySet();
		Map<String, Integer> mapOfMaxWordWithFreq = new HashMap<String, Integer>();
		for (String word : setOfWords) {
			int freq = sortedMap.get(word);
			if (freq>maxFreq) {
				maxFreq = freq;
				maxWord = word;
			}
		}
		mapOfMaxWordWithFreq.put(maxWord, maxFreq);
		return mapOfMaxWordWithFreq;
	}
	
	String printOutput(Map<String, Integer> input) {
		Set<String> setOfKeys = input.keySet();
		String str = null;
		for (String key : setOfKeys) {
			str = key+" -> "+input.get(key);
		}
		return str;
	}
	
	public static void main(String[] args) {
		Assignment88 a = new Assignment88();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Given String is : "+str+"\n");
		System.out.println("Word having maximum frequency in the given string and its frequency is : "+"\n"+a.printOutput(a.getMaxWordFreq(a.findFreq(str))));
	}
}
