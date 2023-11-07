package denish;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment84 {

	Map<String, Integer> getFreqWord(String str) {
		String[] arrOfWords = str.split(" ");
		Map<String, Integer> wordFreq = new LinkedHashMap<String, Integer>();

		for (String name : arrOfWords) {
			if (wordFreq.containsKey(name)) {
				int count = wordFreq.get(name);
				wordFreq.put(name, count + 1);
			} else {
				wordFreq.put(name, 1);
			}
		}
		return wordFreq;
	}

	public static void main(String[] args) {
		String str = "hello techno techno hi credits hi techno hello techno";
		Assignment84 ass = new Assignment84();
		System.out.println(ass.getFreqWord(str));
	}
}
