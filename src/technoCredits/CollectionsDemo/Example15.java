package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class Example15 {

	public static void main(String[] args) {
		List<Double> numList1 = new ArrayList<Double>();
		numList1.add(10.20);
		numList1.add(34.2);
		numList1.add(99.123);
		
		List<Double> numList2 = new ArrayList<Double>();
		numList2.add(110.45);
		numList2.add(34.2);
		numList2.add(199.3);
		
		
		System.out.println(numList1);
		System.out.println(numList2);
		System.out.println("============");
		numList2.addAll(numList1);
		System.out.println(numList1);
		System.out.println(numList2);
		
	}
}
