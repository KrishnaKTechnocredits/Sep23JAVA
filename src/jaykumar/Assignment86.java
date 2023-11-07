/*Assignment-86 : 5th Nov'2023
return list of all the unique (having freq =1) words  from given String.
input : "hello techno techno hi credits hi techno hello techno pune"
output : {hi=2, credits=1, techno=4, hello=2, pune=1}
List<String> getUniqueWord(Map<String, Integer> wordMap){	
}*/

package jaykumar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86 {
	
	Map<String, Integer> getwordFreq(String[] arr){
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String word : arr) {
			if(wordMap.containsKey(word)) {
				int count = wordMap.get(word);
				wordMap.put(word, count+1);
			}else {
				wordMap.put(word, 1);
			}
		}
		return wordMap;
	}
	
	List<String> getUniqueWord(Map<String, Integer> wordMap){
		List<String> wordList = new ArrayList<String>();
		Set<String> setOfKeys = wordMap.keySet();
		for(String word : setOfKeys) {
			int freq = wordMap.get(word);
			if(freq==1) {
				wordList.add(word);
			}
		}
		return wordList;
	}

	public static void main(String[] args) {
		Assignment86 a = new Assignment86();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Given string: "+str);
		String[] arr = str.split(" ");
		System.out.println("Unique words in given string: ");
		System.out.println(a.getUniqueWord(a.getwordFreq(arr)));
	}
}
