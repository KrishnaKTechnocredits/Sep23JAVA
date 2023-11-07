/*Assignment-84 : 5th Nov'2023
Return freq of each word in a given String.
input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2}*/
package swati;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ass84FreqOfEachWordUsingMap {

	Map<String, Integer> getFreqOfWord(String input) {
		System.out.println("Input : " + input);
		String[] newinput = input.split(" ");
		Map<String, Integer> output = new LinkedHashMap<>();
		for (String str : newinput) {
			if (output.containsKey(str)) {
				output.put(str, output.get(str) + 1);
			} else {
				output.put(str, 1);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Ass84FreqOfEachWordUsingMap output = new Ass84FreqOfEachWordUsingMap();
		System.out.println("Output : " + output.getFreqOfWord("hello techno techno hi credits hi techno hello techno"));
	}
}
