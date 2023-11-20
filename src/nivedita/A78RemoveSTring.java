/*Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.

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

input : Gaurang
output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]

while(listOfName.contains("Gaurang")){
	listOfNames.remove("Gaurang");
}*/

package nivedita;

import java.util.ArrayList;

public class A78RemoveSTring {
	
	ArrayList<String> processArrayList(ArrayList<String> inputArr, String removeStr, String addStr){
		for (int index=0; index<inputArr.size(); index++) {
			if(inputArr.get(index).equals(removeStr)) {
				inputArr.remove(index);
				inputArr.add(index, addStr);
			}
		}
		return inputArr;
	}
	
	public static void main(String[] args) {
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
		System.out.println("Output ArrayList : "+new A78RemoveSTring().processArrayList(listOfNames, "Gaurang", "rahul"));
	}
}
