//Assignment-88 : 5th Nov'2023
//Return the word having Maximum frequecy and its frequecy.
//
//input : "hello techno techno hi credits hi techno hello techno pune"
//output : { techno = 4 }

package pushpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {

	Map<String, Integer> getWordFreq(String str) {
		String input[] = str.split(" ");
		Map<String, Integer> hashMapaxFreqWord = new HashMap<String, Integer>();
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String str1 = strArr[i];
			if (hashMapaxFreqWord.containsKey(str1)) {
				int count = hashMapaxFreqWord.get(str1);
				hashMapaxFreqWord.put(str1, count + 1);
			} else {
				hashMapaxFreqWord.put(str1, 1);
			}
		}

		return hashMapaxFreqWord;
	}

	Map<String, Integer>  getMaxFreqString(Map<String, Integer> map) {
		int max = 0;
		Map<String, Integer> hashMap = new HashMap<String, Integer>() ;
		Set<String> keys = map.keySet();
		String str = "";
		for (String string : keys) {
			if (max < map.get(string)) {
				str = string;
				max = map.get(string);
				
			}

		}
		hashMap.put(str, max);
		return  hashMap;

	}

	public static void main(String[] args) {
		Map<String, Integer> hashMapFreqWord = new Assignment88()
				.getWordFreq("hello techno techno hi credits hi techno hello techno pune");
		Map <String , Integer> map = new Assignment88().getMaxFreqString(hashMapFreqWord);
		System.out.println(map);
	}
}
