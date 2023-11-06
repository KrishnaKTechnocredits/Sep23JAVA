/*Assignment-83 : 5th Nov'2023
Return freq of each character in a given String.
input : technocredits
output : {t,2},{e,2},........*/

package jaykumar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment83 {
	
	Map<Character, Integer> processString(String input) {
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		return charMap;
	}
	
	void printFreq(Map<Character, Integer> charMap) {
		System.out.println("Char frequency in LinkedHashMap form: ");
		System.out.println(charMap+"\n");
		Set<Character> keys = charMap.keySet();
		System.out.println("Char frequency in required form: ");
		for(char ch : keys) {
			System.out.print("{"+ch+","+charMap.get(ch)+"}");
		}
	}

	public static void main(String[] args) {
		Assignment83 a = new Assignment83();
		String str = "technocredits";
		System.out.println("Input String: "+str+"\n");
		a.printFreq(a.processString(str));
	}
}
