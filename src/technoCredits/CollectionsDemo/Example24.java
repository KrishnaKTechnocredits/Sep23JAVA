package technoCredits.CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class Example24 {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		System.out.println(hs.add("Gaurang"));
		System.out.println(hs.add("techno"));
		System.out.println(hs.add("techno"));
		
		String str1 = "";
		String str2 = "sfsdfsd0sf";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
