//Assignment-73 : 1st Nov'2023
//Insert number 100 at the index of first negative number.
//input : [13,44,67,-22,14,55,-44,12,-3]
//output : [13,44,67,100,-22,14,55,-44,12,-3]

package sakshi;
import java.util.ArrayList;

public class Assignment73{
	
	void getUniqueNameList(ArrayList<Integer> number){
		for(int index=0; index<number.size(); index++){
			int num = number.get(index);
			if(num<0){
				number.add(index, 100);
				break;
			}
		}
		System.out.println("output --> " +number);
	}
	
	public static void main(String[] args){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(44);
		numbers.add(67);
		numbers.add(-22);
		numbers.add(14);
		numbers.add(55);
		numbers.add(-44);
		numbers.add(-12);
		numbers.add(-3);
		System.out.println("input--> " + numbers);
		new Assignment73().getUniqueNameList(numbers);
	}
} 
