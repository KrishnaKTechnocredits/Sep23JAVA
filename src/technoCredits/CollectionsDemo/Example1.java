package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Maulik");
		al.add(true);
		al.add('t');
		al.add(10.10);
		
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.get(al.size()-1));
	}
}
