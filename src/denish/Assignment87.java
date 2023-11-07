/*Assignment-87 : 5th Nov'2023
Return the word having Maximum frequecy.
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno
*/
package denish;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment87 {

	Map<String, Integer> getWordsFreq(String input) {
		String[] arr = input.split(" ");
		Map<String, Integer> output = new LinkedHashMap<String, Integer>();

		for (String str : arr) {
			if (output.containsKey(str))
				output.put(str, output.get(str) + 1);
			else
				output.put(str, 1);
		}
		return output;
	}

	String getMaxFreq(Map<String, Integer> wordMap) {
		Set<String> keys = wordMap.keySet();
		int max = 0;
		String maxWord = "";

		for (String str : keys) {
			if (max < wordMap.get(str)) {
				max = wordMap.get(str);
				maxWord = str;
			}
		}
		return maxWord;
	}

	public static void main(String[] args) {
		Assignment87 output = new Assignment87();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		Map<String, Integer> wordMap = output.getWordsFreq(str);
		System.out.println("Output : " + output.getMaxFreq(wordMap));
	}

}
