/*Assignment-88 : 5th Nov'2023
Return the word having Maximum frequecy and its frequecy.

input : "hello techno techno hi credits hi techno hello techno pune"
output : techno 
}*/

package deepak;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment88_GetWordWithMaxFrequency1 {

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

	String getMaxFrequencyWord(Map<String, Integer> wordMap) {
		Set<String> keys = wordMap.keySet();
		int max = 0;
		String maxWord = "";
		for (String str : keys) {
			if (max < wordMap.get(str)) {
				max = wordMap.get(str);
				maxWord = str;
			}
		}
		return maxWord + " --> " + max;
	}

	public static void main(String[] args) {
		Assignment88_GetWordWithMaxFrequency1 output = new Assignment88_GetWordWithMaxFrequency1();
		Map<String, Integer> wordMap = output
				.getWordsFrequencyMap("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + output.getMaxFrequencyWord(wordMap));
	}
}