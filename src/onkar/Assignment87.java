/*Return the word having Maximum frequecy.


Map<String,Integer> processWordMap(String str){

}


String getMaxWordFreq(Map<String,Integer> mapOfWords){

}


input : "hello techno techno hi credits hi techno hello techno pune"
output : techno*/

package onkar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment87 {
	
	Map<String, Integer> findFreq(String input){
		String[] arr = input.split(" ");
		Map<String, Integer> processedMap = new LinkedHashMap<String, Integer>();
		for (String word : arr) {
			if(processedMap.containsKey(word)) {
				int count = processedMap.get(word);
				processedMap.put(word, ++count);
			}else {
				processedMap.put(word, 1);
			}
		}
		return processedMap;
	}
	
	String getMaxWordFreq(Map<String,Integer> mapOfWords){
		String maxFreqWord = null;
		int maxFreq = 0;
		Set<String> wordList = mapOfWords.keySet();
		for(String word: wordList) {
			int freq = mapOfWords.get(word);
			if (freq > maxFreq) {
				maxFreqWord = word;
				maxFreq = freq;
			}
		}
		return maxFreqWord;
	}
	
	public static void main(String[] args) {
		Assignment87 a = new Assignment87();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Given String is : "+str+"\n");
		System.out.println("Word having maximum frequency in the given string is : "+a.getMaxWordFreq(a.findFreq(str)));
	}
}
