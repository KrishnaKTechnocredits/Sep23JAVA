/* WAP to Return freq of each word in a given String.

input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2} */

package sayali;

import java.util.HashMap;
import java.util.Map;

class Assignment84 {
	Map<String, Integer> getWordFreq(String str) {
		String arrOfWords[] = str.split(" ");
		Map<String, Integer> mapOfWord = new HashMap<String, Integer>();
		for (String word : arrOfWords) {
			if (mapOfWord.containsKey(word)) {
				int count = mapOfWord.get(word);
				mapOfWord.put(word, count + 1);
			} else {
				mapOfWord.put(word, 1);
			}
		}
		System.out.println("Output: " +mapOfWord);
		return mapOfWord;
	}

	public static void main(String[] args) {
		String str = "hello techno techno hi credits hi techno hello techno";
		new Assignment84().getWordFreq(str);
	}
}