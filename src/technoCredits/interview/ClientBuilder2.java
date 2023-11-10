package technoCredits.interview;

import java.util.Set;
import java.util.TreeSet;

public class ClientBuilder2 {
	
	public static void main(String[] args) {
		Builder builder1 = new Builder("Kalpataru","Pune",12,30);
		Builder builder2 = new Builder("Rohan","Nagpur",8,45);
		Builder builder3 = new Builder("VJ","Mumbai",18,20);
		Builder builder4 = new Builder("Abc","Pune",13,30);
		
		
		Set<Builder> listOfBuilder = new TreeSet<Builder>(new NameComparator());
		listOfBuilder.add(builder1);
		listOfBuilder.add(builder2);
		listOfBuilder.add(builder3);
		listOfBuilder.add(builder4);
		
		System.out.println("Builders are sorted based on Name :");
		System.out.println(listOfBuilder);
		
		
		Set<Builder> listOfBuilder1 = new TreeSet<Builder>(new YearsOfExpComparator());
		listOfBuilder1.add(builder1);
		listOfBuilder1.add(builder2);
		listOfBuilder1.add(builder3);
		listOfBuilder1.add(builder4);
		
		System.out.println("Buiders are sorted based on years of exp :");
		System.out.println(listOfBuilder1);
	}
}
