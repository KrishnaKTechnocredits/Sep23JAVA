package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example12 {
	
	void m1() {
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("Techno","Credits"));
		al1.add("Hi");
		al1.add("Hello");
		
		ArrayList<String> al2 = new ArrayList<String>(al1);
		al2.add("credits");
		System.out.println(al2);
	}
	
	
	public static void main(String[] args) {
		/*
		 * String[] arr = {"Jay", "Jay", "Sakshi", "Roshni", "Roshni", "Roshni"};
		 * List<String> list = Arrays.asList(arr);
		 * 
		 * ArrayList<String> inputList = new ArrayList<String>(list);
		 * inputList.remove(0); System.out.println(inputList);
		 */
		new Example12().m1();
	}
}
