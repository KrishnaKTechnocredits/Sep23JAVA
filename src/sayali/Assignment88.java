/* WAP to Return the word having Maximum frequecy and its frequecy.
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno --> 4
} */

package sayali;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {

	Map<String, Integer> getMaxFrequencyWordMap(String input) {
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
		Assignment88 ass88 = new Assignment88();
		Map<String, Integer> wordMap = ass88
				.getMaxFrequencyWordMap("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + ass88.getMaxFrequencyWord(wordMap));
	}
}