//Assignment-77 : 2nd Nov'2023
//Remove all occurances of given name from ArrayList.
//input : Gaurang
//output : [Sakshi, Swati, Onkar, Jay, Hetal, Nivedita, Onkar, Jyoti]

package sakshi;
import java.util.ArrayList;

public class Assignment77{
	
	void removeDuplicateString(ArrayList<String> nameListNew, String name){
		while(nameListNew.contains(name)){
			nameListNew.remove(name);
			}
			System.out.println("output -> " + nameListNew);
		}
		

	public static void main(String[] args){
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); 
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		
		String str = "Gaurang";
		
		System.out.println("output -> " + listOfNames);
		
		new Assignment77().removeDuplicateString(listOfNames, str);
	}


}