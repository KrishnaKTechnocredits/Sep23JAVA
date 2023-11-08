/*Assignment-88 : 5th Nov'2023
Return the word having Maximum frequecy and its frequecy.
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno -4
}*/
package shrutika;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class As88MaxFreqWordFreq {

	Map<String, Integer> getFrequencyofWord(String input) {
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

	String getWordWithMaxFrequency(Map<String, Integer> wordMap) {
		Set<String> keys = wordMap.keySet();
		int max = 0;
		String maxFreqWord = "";
		for (String str : keys) {
			if (max < wordMap.get(str)) {
				max = wordMap.get(str);
				maxFreqWord = str;
			}
		}
		return maxFreqWord + " = " + max;
	}

	public static void main(String[] args) {
		As88MaxFreqWordFreq as88 = new As88MaxFreqWordFreq();
		Map<String, Integer> wordMap = as88.getFrequencyofWord("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Word with Maximum frequecy is : " + as88.getWordWithMaxFrequency(wordMap));
	}
}
