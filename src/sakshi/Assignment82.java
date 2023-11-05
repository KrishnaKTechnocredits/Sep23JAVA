//Assignment-82 : 4th Nov'2023
//Return all duplicate number from all given numbers in appropiate Data structure.
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,55]


package sakshi;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment82{
	
	public static void main(String[] args){
		Integer [] numbers = {10,11,10,44,55,4,55,66,67};
		ArrayList<Integer> numberList1 = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> numberList2 = new ArrayList<Integer>();
		Set<Integer> list = new LinkedHashSet<Integer>();
		
		for(int index=0; index<numberList1.size(); index++){
			Integer i = numberList1.get(index);
			if(!list.add(i)){
				numberList2.add(i);
			}	
		}
		System.out.println(numberList2);
	}
	
}