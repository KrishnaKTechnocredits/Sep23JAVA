//Assignment-78 : 2nd Nov'2023
//Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.
//input : Gaurang
//output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]

package sakshi;
import java.util.ArrayList;

public class Assignment78{
	
	void removeDuplicateString(ArrayList<String> nameListNew, String name){
		while(nameListNew.contains(name)){
			nameListNew.set(nameListNew.indexOf(name), "Rahul");
		}
			System.out.println("output -> " + nameListNew);
		}
		
	public static void main(String[] args){
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		
		String str = "Gaurang";
		System.out.println("output -> " + listOfNames);
		new Assignment78().removeDuplicateString(listOfNames, str);
	}


}