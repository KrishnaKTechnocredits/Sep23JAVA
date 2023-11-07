//Assignment-84 : 5th Nov'2023
//Return freq of each word in a given String.
//
//input : "hello techno techno hi credits hi techno hello techno"
//output : {hi=2, credits=1, techno=4, hello=2}

package pushpa;

import java.util.HashMap;

public class Assignment84 {

	public HashMap<String, Integer> countFreqOfLetter(String str) {
		HashMap<String, Integer> hashMapChars = new HashMap<String, Integer>();
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String str1 = strArr[i];
			if (hashMapChars.containsKey(str1)) {
				int count = hashMapChars.get(str1);
				hashMapChars.put(str1, count + 1);
			} else {
				hashMapChars.put(str1, 1);
			}
		}
		return hashMapChars;

	}

	public static void main(String[] args) {
		HashMap<String, Integer> hashMapChars = new Assignment84()
				.countFreqOfLetter("hello techno techno hi credits hi techno hello techno");
		System.out.println(hashMapChars);
	}
}
