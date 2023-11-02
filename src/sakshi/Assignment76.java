//Assignment-76 : 2nd Nov'2023
//Remove all the duplicate values from the list. 
//input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
//output : {"Techno", "Credits", "Hi", "Hello","Pune"}  
//hint : get(), indexOf(), lastIndexOf(), remove()

package sakshi;
import java.util.ArrayList;

public class Assignment76{
	
	void removeDuplicates(ArrayList<String> nameListNew){
		for(int index=0; index<nameListNew.size(); index++){
			String name = nameListNew.get(index);
			if(nameListNew.indexOf(name) != nameListNew.lastIndexOf(name)){
				nameListNew.remove(nameListNew.lastIndexOf(name));
				
			}
		}
		System.out.println("output -> " + nameListNew);
	}

	public static void main(String[] args){
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Techno");
		nameList.add("Credits");
		nameList.add("Techno");
		nameList.add("Hi");
		nameList.add("Hello");
		nameList.add("Pune");
		nameList.add("Hi");
		
		System.out.println("output -> " + nameList);
		
		new Assignment76().removeDuplicates(nameList);
	}

}