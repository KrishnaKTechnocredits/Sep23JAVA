/* WAP to return list of all the unique (having freq =1) words  from given String.

input : "hello techno techno hi credits hi techno hello techno pune"
output : {credits=1, pune=1}


List<String> getUniqueWord(Map<String, Integer> wordMap){
	
} */

package sayali;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86 {

	Map<String, Integer> getUniqueWordsFrequencyMap(String input) {
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
		List<String> output1 = new ArrayList<>();
		for (String str : keys) {
			if (wordMap.get(str) == 1) {
				output1.add(str);
			}
		}
		return output1;
	}

	public static void main(String[] args) {
		Assignment86 ass86 = new Assignment86();
		Map<String, Integer> wordMap = ass86
				.getUniqueWordsFrequencyMap("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + ass86.getUniqueWords(wordMap));
	}
}