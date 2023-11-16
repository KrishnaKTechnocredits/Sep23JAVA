/*Return freq of each character in a given String.

input : technocredits
output : {t,2},{e,2},........*/

package onkar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment83 {
	
	Map<String, Integer> findFreq (String input){
		Map<String, Integer> charMap = new LinkedHashMap<String, Integer>();
		String[] arr = input.split("");
		for (String letter : arr) {
			if(charMap.containsKey(letter)) {
				int count = charMap.get(letter);
				charMap.put(letter, ++count);
			}else {
				charMap.put(letter, 1);
			}
		}
		return charMap;
	}
	
	void printFreq (String input) {
		Map<String, Integer> charMap = findFreq(input);
		Set<String> keys = charMap.keySet();
		System.out.println("Printed LinkedHashSet : ");
		System.out.println(charMap+"\n");
		System.out.println("Printed output in required format :");
		for(String ch : keys) {
			System.out.print("{"+ch+","+charMap.get(ch)+"}");
		}
	}
	
	public static void main(String[] args) {
		Assignment83 a = new Assignment83();
		new Assignment83().printFreq("technocredits");
	}
}
