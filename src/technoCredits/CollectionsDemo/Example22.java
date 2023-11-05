package technoCredits.CollectionsDemo;

import java.util.HashSet;

public class Example22 {
	
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("Client4");
		hs.add("Client2");
		hs.add("Client3");
		hs.add("Client2");
		hs.add("Client3");
		hs.add("Client4");
		hs.add("Client1");
		hs.add("Cluster123");
		hs.add(123);
		hs.add(null);
		hs.add("");
		
		System.out.println(hs.size()); // 4
		System.out.println(hs);
	}
}
