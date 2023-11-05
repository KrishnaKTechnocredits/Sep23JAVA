//Assignment-84 : 5th Nov'2023
//Return freq of each word in a given String.
//input : "hello techno techno hi credits hi techno hello techno"
//output : {hi=2, credits=1, techno=4, hello=2}
package sakshi;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Assignment84{
	
	static Map<String,Integer> getCharFreq(String[] strArray){
		Map<String,Integer> hm = new HashMap<String,Integer>();
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
	
	public static void main(String[] args){
		String str = "hello techno techno hi credits hi techno hello techno";
		String[] nameArray = str.split(" ");
		System.out.println(getCharFreq(nameArray));
	}
}