/*Assignment-87 : 5th Nov'2023
Return the word having Maximum frequecy.
Map<String,Integer> processWordMap(String str){
}
String getMaxWordFreq(Map<String,Integer> mapOfWords){
}
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno
}*/
package swati;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Ass87WordWithMaxFreq {

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
		return maxFreqWord;
	}

	public static void main(String[] args) {
		Ass87WordWithMaxFreq ass87 = new Ass87WordWithMaxFreq();
		Map<String, Integer> wordMap = ass87
				.getFrequencyofWord("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Word having Maximum frequecy is : " + ass87.getWordWithMaxFrequency(wordMap));
	}
}
