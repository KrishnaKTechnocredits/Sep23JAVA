/*Assignment-86 : 5th Nov'2023
return list of all the unique (having freq =1) words  from given String.

input : "hello techno techno hi credits hi techno hello techno pune"
output : { credits=1, pune=1}
*/
package denish;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment86 {

	Map<String, Integer> getUnique(String str) {
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

	void uniqueWord(Map<String, Integer> input) {
		Set<String> word = input.keySet();

		for (String output : word) {
			int freq = input.get(output);
			if (freq == 1) {
				System.out.println(output + "->" + freq);
			}
		}
	}

	public static void main(String[] args) {
		String str = "hello techno techno hi credits hi techno hello techno pune";
		Assignment86 ass = new Assignment86();
		Map<String, Integer> uniqueName = ass.getUnique(str);
		ass.uniqueWord(uniqueName);
	}
}
