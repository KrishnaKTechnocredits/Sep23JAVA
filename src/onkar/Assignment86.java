/*return list of all the unique (having freq =1) words  from given String.

input : "hello techno techno hi credits hi techno hello techno pune"
output : {hi=2, credits=1, techno=4, hello=2, pune=1}


List<String> getUniqueWord(Map<String, Integer> wordMap){
	
}*/

package onkar;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment86 {
	
	Map<String, Integer> findFreq(String input){
		Map<String, Integer> processedMap = new LinkedHashMap<String, Integer>();
		String[] arr = input.split(" ");
		for (String word : arr) {
			if(processedMap.containsKey(word)) {
				int count = processedMap.get(word);
				processedMap.put(word, ++count);
			}else {
				processedMap.put(word, 1);
			}
		}
		return processedMap;
	}
	
	List<String> getUniqueWord(Map<String, Integer> wordMap){
		List<String> uniqueWordList = new ArrayList<String>();
		Set<String> setOfKeys = wordMap.keySet();
		for (String str : setOfKeys) {
			int freq = wordMap.get(str);
			if (freq == 1)
				uniqueWordList.add(str);
		}
		return uniqueWordList;
	}
	public static void main(String[] args) {
		Assignment86 a = new Assignment86();
		String str = "hello techno techno hi credits hi techno hello techno pune";
		System.out.println("Given string is : "+str+"\n");
		System.out.println("Unique words in given string: ");
		System.out.println(a.getUniqueWord(a.findFreq(str)));
	}
}
