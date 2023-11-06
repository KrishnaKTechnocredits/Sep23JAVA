/*Assignment-84 : 5th Nov'2023
Return freq of each word in a given String.

input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2}*/

package deepak;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment84_WordFrequencyMap {

	Map<String, Integer> getWordFrequencyMap(String input) {
		System.out.println("Input : " + input);
		String[] arr = input.split(" ");
		Map<String, Integer> output = new LinkedHashMap<>();
		for (String str : arr) {
			if (output.containsKey(str)) {
				output.put(str, output.get(str) + 1);
			} else {
				output.put(str, 1);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment84_WordFrequencyMap output = new Assignment84_WordFrequencyMap();
		System.out.println(
				"Output : " + output.getWordFrequencyMap("hello techno techno hi credits hi techno hello techno"));
	}
}
