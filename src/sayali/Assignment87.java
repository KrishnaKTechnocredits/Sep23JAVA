/* WAP to Return the word having Maximum frequecy.
Map<String,Integer> processWordMap(String str){
}
String getMaxWordFreq(Map<String,Integer> mapOfWords){
}
input : "hello techno techno hi credits hi techno hello techno pune"
output : techno
} */

package sayali;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment87 {

	Map<String, Integer> processWordMap(String input) {
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

	String getMaxWordFreq(Map<String, Integer> wordMap) {
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
		Assignment87 ass87 = new Assignment87();
		Map<String, Integer> wordMap = ass87
				.processWordMap("hello techno techno hi credits hi techno hello techno pune");
		System.out.println("Output : " + ass87.getMaxWordFreq(wordMap));
	}

}