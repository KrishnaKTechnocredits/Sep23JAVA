package technoCredits.interview;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordFreq {
	
	Map<String, Integer> getWordFreq(String str) {
		String[] arrOfWords = str.split(" ");
		Map<String, Integer> mapOfWord = new Hashtable<String, Integer>();
		
		for(String word : arrOfWords) {
			if(mapOfWord.containsKey(word)) {
				int count = mapOfWord.get(word);
				mapOfWord.put(word, count+1);
			}else {
				mapOfWord.put(word, 1);
			}
		}
		
		return mapOfWord;
	}
	
	void printDuplicateWord(Map<String, Integer> wordMap) {
		Set<String> setOfkeys = wordMap.keySet();
		for(String key : setOfkeys) {
			int value = wordMap.get(key);
			if(value > 1) {
				System.out.println(key + "-->" + value);
			}
		}

	}
	
	List<String> getDuplicateWord(Map<String, Integer> wordMap) {
		List<String> duplicateWords = new ArrayList<String>();
		Set<String> setOfkeys = wordMap.keySet();
		
		for(String key : setOfkeys) {
			int value = wordMap.get(key);
			if(value > 1) {
				duplicateWords.add(key);
			}
		}
		return duplicateWords;
	}
	
	void printValues(Map<String, Integer> wordMap) {
		System.out.println(wordMap.values());
		Set<Integer> setOfValues = new LinkedHashSet<>(wordMap.values());
		System.out.println(setOfValues);
	}
	
	public static void main(String[] args) {
		String str = "hello techno techno hi credits hi techno hello techno";
		WordFreq freq = new WordFreq();
		Map<String, Integer> wordFreqMap = freq.getWordFreq(str);
		System.out.println(wordFreqMap);
		freq.printDuplicateWord(wordFreqMap);
		freq.printValues(wordFreqMap);
	}
}
