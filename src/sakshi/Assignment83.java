//Assignment-83 : 5th Nov'2023
//Return freq of each character in a given String.
//input : technocredits
//output : {t,2},{e,2},........

package sakshi;
import java.util.Map;
import java.util.LinkedHashMap;

public class Assignment83{
	
	Map<Character,Integer> getCharFreq(String str){
		Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
		for(int index=0; index<str.length();index++){
			char ch = str.charAt(index);
			if(hm.containsKey(ch)){
				int count = hm.get(ch);
				hm.put(ch,count+1);
			}else{
				hm.put(ch,1);
			}
		}
		return hm;	
	}
	
	public static void main(String[] args){
		String str = "technocredits";
		System.out.println(new Assignment83().getCharFreq(str));
	}
}