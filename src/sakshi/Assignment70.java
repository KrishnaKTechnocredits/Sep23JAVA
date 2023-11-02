//Assignment-70 : 1st Nov'2023
//Write a method to print unique names from given ArrayList.

package sakshi;
import java.util.ArrayList;

public class Assignment70{
	
	void getUniqueNameList(ArrayList<String> listOfNames){
		for(int index=0; index<listOfNames.size(); index++){
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)){
				System.out.println("this is the unique element -->" + name);
			}
		}
	}
	
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("sakshi");
		names.add("sakshi");
		names.add("techno");
		names.add("credits");
		names.add("sakshi");
		names.add("sakshi");
		
		new Assignment70().getUniqueNameList(names);
	}
} 

