package technoCredits.CollectionsDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example23 {
	
	public static void main(String[] args) {
		String[] arr = {"Onkar","Shrutika","Sakshi","Gaurang","Hetal","Onkar","Jay"};
		Set<String> hs = new HashSet<String>(Arrays.asList(arr));
		
		for(String name : hs) {
			if(name.length()>5)
				System.out.println(name);
		}
		
		System.out.println(hs.size());
		System.out.println(hs.contains("Maulik"));
		System.out.println(hs.remove("Sakshi"));
		
		System.out.println(hs);
	}
}
