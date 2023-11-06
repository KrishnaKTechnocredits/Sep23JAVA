/*Assignment-86 : 5th Nov'2023
return list of all the unique (having freq =1) words  from given String.

input : "hello techno techno hi credits hi techno hello techno pune"
output : {hi=2, credits=1, techno=4, hello=2, pune=1}

List<String> getUniqueWord(Map<String, Integer> wordMap){
	
}*/

package deepak;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86_GetUniqueWords {

	Map<String, Integer> getWordsFrequencyMap(String input) {
		String[] arr = input.split(" ");
		System.out.println("Input : " + input);
		Map<String, Integer> output = new LinkedHashMap<>();
		for (String str : arr) {
			if (output.containsKey(str))
				output.put(str, output.get(str) + 1);
			else
				output.put(str, 1);
		}
		return output;
	}

	List<String> getUniqueWords(Map<String, Integer> wordMap) {
		Set<String> keys = wordMap.keySet();
		List<String> outputList = new ArrayList<>();
		for (String str : keys) {
			if (wordMap.get(str) == 1) {
				outputList.add(str);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		Assignment86_GetUniqueWords output = new Assignment86_GetUniqueWords();
		Map<String, Integer> wordMap = output
				.getWordsFrequencyMap("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + output.getUniqueWords(wordMap));
	}

}