//Assignment-71 : 1st Nov'2023
//Write a method to return unique list of names from given ArrayList.
package sakshi;
import java.util.ArrayList;

public class Assignment71{
	
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		for(int index=0; index<listOfNames.size(); index++){
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)){
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
		names.add("sakshi");
		names.add("sakshi");
		
		System.out.println(new Assignment71().getUniqueNameList(names));
	}
} 