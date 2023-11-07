/*Assignment-84 : 5th Nov'2023
Return freq of each word in a given String.
input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2}*/

package jaykumar;

import java.util.Map;
import java.util.HashMap;

public class Assignment84 {
	
	Map<String, Integer> getWordFreq(String[] arr){
		Map<String, Integer> wordMap = new HashMap<String, Integer> ();
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

	public static void main(String[] args) {
		Assignment84 a = new Assignment84();
		String str = "hello techno techno hi credits hi techno hello techno";
		String[] arr = str.split(" ");
		System.out.println("Frequency of words in given string is: "+a.getWordFreq(arr));
	}
}
