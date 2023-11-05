package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example13 {

	void processData(ArrayList<String> listOfNames){
		while(listOfNames.size()>0){
			String name = listOfNames.get(0);
			int orgSize = listOfNames.size();
			while(listOfNames.contains(name)){
				listOfNames.remove(name);
			}
			int newSize = listOfNames.size();
			System.out.println(name + "--" + (orgSize-newSize));
		}
	}

	public static void main(String[] args) {
		Example13 ex = new Example13();
		String[] arr = {"Jay", "Jay", "Sakshi", "Roshni", "Roshni", "Roshni"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		ex.processData(al);
	}
}
