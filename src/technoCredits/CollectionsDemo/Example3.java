package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example3 {
	
	void verifyNameExist(ArrayList<String> listOfNames) {
		boolean flag = false;
		for(int index=0;index<listOfNames.size();index++) {
			String name = listOfNames.get(index);
			if(name.equals("Hetal")) {
				flag = true;
				System.out.println("Name found");
				break;
			}
		}
		if(!flag)
			System.out.println("Name not found");
	}
	
	void verifyNameExistUsingMethod(ArrayList<String> listOfNames) {
		boolean flag = listOfNames.contains("Hetal");
		if(flag)
			System.out.println("Name found");
		else
			System.out.println("Name not found");
	}
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Nivedita");
		listOfNames.add("Swati");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Jay");
		listOfNames.add("Hetal");
		listOfNames.add("Jyoti");
		listOfNames.add("Hetal");
	
		System.out.println(listOfNames);
		
		new Example3().verifyNameExistUsingMethod(listOfNames);
		
	}
}
