package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example14 {

	Integer x = 1;	
	int x1 = 1;
	
	void processData(ArrayList<Integer> listOfNames){
		while(listOfNames.size()>0){
			Integer num = listOfNames.get(0);
			int orgSize = listOfNames.size();
			while(listOfNames.contains(num)){
				listOfNames.remove(num);
			}
			int newSize = listOfNames.size();
			System.out.println(num + "--" + (orgSize-newSize));
		}
	}

	public static void main(String[] args) {
		Example14 ex = new Example14();
		Integer[] arr = {10,10,12,10,12,13,14,12};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		ex.processData(al);
	}
}
