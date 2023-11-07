//Assignment-86 : 5th Nov'2023
//return list of all the unique (having freq =1) words  from given String.
//
//Assignment-86 : 5th Nov'2023
//return list of all the unique (having freq =1) words  from given String.
//input : "hello techno techno hi credits hi techno hello techno pune"
//output : credits=1
//		pune =1 

package pushpa;

import java.util.HashMap;
import java.util.Map;

public class Assignment86 {

	Map<String, Integer> getUniqueWordFreq(String str) {
		String input[] = str.split(" ");
		Map<String, Integer> hashMapUniqueString = new HashMap<String, Integer>();
		for (int i = 0; i < input.length; i++) {
			String str1 = input[i];
			int firstIndex = str.indexOf(str1);
            int lastIndex = str.lastIndexOf(str1);
			if (firstIndex == lastIndex) {
				hashMapUniqueString.put(str1, 1);
			} 
		}
		
		return hashMapUniqueString;
	}

	public static void main(String[] args) {
		Map<String, Integer> hashMapUniqueString = new Assignment86()
				.getUniqueWordFreq("hello techno techno hi credits hi techno hello techno pune");
		System.out.println(hashMapUniqueString);
	}
}
