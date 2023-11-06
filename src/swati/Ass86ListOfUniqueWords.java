/*Assignment-86 : 5th Nov'2023
return list of all the unique (having freq =1) words  from given String.
input : "hello techno techno hi credits hi techno hello techno pune"
output : { credits, pune}
List<String> getUniqueWord(Map<String, Integer> wordMap){
}*/
package swati;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ass86ListOfUniqueWords {

	Map<String, Integer> getFreqOfWord(String input) {
		String[] arr = input.split(" ");
		System.out.println("Input : " + input);
		Map<String, Integer> wordFreq = new LinkedHashMap<>();
		for (String str : arr) {
			if (wordFreq.containsKey(str))
				wordFreq.put(str, wordFreq.get(str) + 1);
			else
				wordFreq.put(str, 1);
		}
		return wordFreq;
	}

	List<String> getUniqueWords(Map<String, Integer> wordMap) {
		Set<String> keys = wordMap.keySet();
		List<String> outputList = new ArrayList<>();
		for (String str : keys) {
			int freq = wordMap.get(str);
			if (freq == 1) {
				outputList.add(str);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		Ass86ListOfUniqueWords ass86 = new Ass86ListOfUniqueWords();
		Map<String, Integer> wordMap = ass86
				.getFreqOfWord("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + ass86.getUniqueWords(wordMap));
	}
}
