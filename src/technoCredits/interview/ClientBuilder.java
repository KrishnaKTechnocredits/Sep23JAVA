package technoCredits.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientBuilder {
	
	public static void main(String[] args) {
		Builder builder1 = new Builder("Kalpataru","Pune",12,30);
		Builder builder2 = new Builder("Rohan","Nagpur",8,45);
		Builder builder3 = new Builder("VJ","Mumbai",18,20);
		
		List<Builder> listOfBuilder = new ArrayList<Builder>();
		listOfBuilder.add(builder1);
		listOfBuilder.add(builder2);
		listOfBuilder.add(builder3);
		
		System.out.println(listOfBuilder);
		//Collections.sort(listOfBuilder);
		System.out.println("======================");
		System.out.println(listOfBuilder);
	}
}
