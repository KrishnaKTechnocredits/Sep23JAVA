/*Remove all occurances of given name from ArrayList.

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
output : [Sakshi, Swati, Onkar, Jay, Hetal, Nivedita, Onkar, Jyoti]

while(listOfName.contains("Gaurang")){
	listOfNames.remove("Gaurang");
}
*/

package nivedita;

import java.util.ArrayList;

public class A77RemoveString {
	
	ArrayList<String> removeGivenString(ArrayList<String> inputArr, String input){
		for (int index=0; index<inputArr.size(); index++) {
			if (inputArr.get(index).equals(input)) {
				inputArr.remove(index);
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
		System.out.println("Output ArrayList : "+new A77RemoveString().removeGivenString(listOfNames, "Gaurang"));
	}
}
