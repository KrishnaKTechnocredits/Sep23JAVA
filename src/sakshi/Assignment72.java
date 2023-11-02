//Assignment-72 : 1st Nov'2023
//Write a method to return list of names having frequency more than 1 from given ArrayList.
package sakshi;
import java.util.ArrayList;

public class Assignment72{
	
	ArrayList<String> getCommonName(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		for(int index=0; index<listOfNames.size(); index++){
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)){
				targetNameList.add(name);
			}
		}
		return targetNameList;
	}
	
	public static void main(String[] args){
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("sakshi");
		names.add("sakshi");
		names.add("techno");
		names.add("credits");
		names.add("credits");
		names.add("Vikash");
		names.add("sakshi");
		
		System.out.println("input --> " + names);
		System.out.println("Output --> " + new Assignment72().getCommonName(names));
	}
} 