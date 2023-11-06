//Assignment-80 : 3rd Nov'2023
//Write a program to print freq of each name using ArrayList.
//input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
//output : Techno -> 3
//         Credits -> 2
//		 Hello -> 1

package sakshi;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80{
	
	void printFreq(ArrayList<String> nameList){
		while(nameList.size()>0){
			String name = nameList.get(0);
			int orgLength = nameList.size();
				while(nameList.contains(name)){
					nameList.remove(name);
				}
				int newLength = nameList.size();
				System.out.println(name + "-->" + (orgLength-newLength));
		}
	}
	
	public static void main(String[] args){
		String [] names = {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));
		System.out.println(nameList);
		new Assignment80().printFreq(nameList);
	}
	
}