//Assignment-86 : 5th Nov'2023
//return list of all the unique (having freq =1) words  from given String.
//input : "hello techno techno hi credits hi techno hello techno pune"
//output : credits=1
//		pune =1 
package sakshi;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Set;
public class Assignment86{
	
	static Map<String,Integer> getCharFreq(String[] strArray){
		Map<String,Integer> hm = new LinkedHashMap<String,Integer>();
			for(String name:strArray){
			if(hm.containsKey(name)){
				int count = hm.get(name);
				hm.put(name,count+1);
			}else{
				hm.put(name,1);
			}
		}
		return hm;		
	}
	
	static void getUniqueWord(Map<String, Integer> wordMap){
		Set <String> word = wordMap.keySet();
		for(String newWord:word){
			int freq = wordMap.get(newWord);
			if(freq == 1)
			System.out.println(newWord + " = " +freq);
		}
	}
	
	public static void main(String[] args){
		String str = "hello techno techno hi credits hi techno hello techno pune";
		String[] nameArray = str.split(" ");
		Map<String,Integer> frequency = getCharFreq(nameArray);
		getUniqueWord(frequency);
	}
}