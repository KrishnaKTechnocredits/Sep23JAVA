/* WAP to Return freq of each character in a given String.

input : technocredits
output : {t,2},{e,2},........ */

package sayali;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment83 {

	Map<Character, Integer> getCharFreq (String str){
		Map<Character,Integer> freqMap = new LinkedHashMap<Character,Integer>();
		for (char ch : str.toCharArray()) {
			if (freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch) + 1);
			} else {
				freqMap.put(ch, 1);
			}
		}
		return freqMap;
	}
	
	public static void main(String[] args) {
		String str = "technocredits";
		//Map<Character, Integer> freqMap = new LinkedHashMap<>();
		System.out.println(new Assignment83().getCharFreq(str));
	}
}