//Assignment-79 : 3rd Nov'2023
//Write a program to print freq of each number using ArrayList.
//input : {10,20,10,10,11,11,13}
//output : 10 -> 3
//         20 -> 1
//		 11 -> 2
//		 13 -> 1

package sakshi;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79{
	
	void printFreq(ArrayList<Integer> numList){
		while(numList.size()>0){
			int num = numList.get(0);
			int orgLength = numList.size();
				while(numList.contains(num)){
					numList.remove(Integer.valueOf(num));
				}
				int newLength = numList.size();
				System.out.println(num + "-->" + (orgLength-newLength));
		}
	}
	
	public static void main(String[] args){
		Integer [] num = {10,20,10,10,11,11,13};
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(num));
		new Assignment79().printFreq(numList);
	}
	
}