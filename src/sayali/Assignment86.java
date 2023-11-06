/* WAP to return list of all the unique (having freq =1) words  from given String.

input : "hello techno techno hi credits hi techno hello techno pune"
output : {credits=1, pune=1}


List<String> getUniqueWord(Map<String, Integer> wordMap){
	
} */

package sayali;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment86 {

	Map<String, Integer> getUniqueWords(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> wordFreq = new LinkedHashMap<String, Integer>();

		for (String name : arr) {
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
		Assignment86 ass86 = new Assignment86();
		Map<String, Integer> uniqueNameAndFreq = ass86.getUniqueWords(str);
		System.out.println("Output: ");
		ass86.uniqueWord(uniqueNameAndFreq);
	}
}