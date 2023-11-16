/*Return freq of each word in a given String.

input : "hello techno techno hi credits hi techno hello techno"
output : {hi=2, credits=1, techno=4, hello=2}*/

package onkar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment84 {
	
	Map<String, Integer> findFreq(String input){
		Map<String, Integer> list = new LinkedHashMap<String, Integer>();
		String[] arr = input.split(" ");
		for (String key : arr) {
			if(list.containsKey(key)) {
				int count = list.get(key);
				list.put(key, ++count);
			}else {
				list.put(key, 1);
			}
		}
		return list;
	}
	
	void printFreq(String input){
		Map<String, Integer> list = findFreq(input);
		System.out.println("LinkedHashMap with frequency :");
		System.out.println(list+"\n");
		/*
		 * System.out.println("Output in required format :"); Set<String> keys =
		 * list.keySet(); for(String str : keys) {
		 * System.out.print("{"+str+","+list.get(str)+"} "); }
		 */
 	}
	
	public static void main(String[] args) {
		new Assignment84().printFreq("hello techno techno hi credits hi techno hello techno");
	}
}
