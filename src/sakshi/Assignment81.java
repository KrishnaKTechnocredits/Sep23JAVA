//Assignment-81 : 4th Nov'2023
//Return unique set of number from all given numbers.
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,11,44,55,4,66,67]


package sakshi;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class Assignment81{
	
	public static void main(String[] args){
		Integer [] numbers = {10,11,10,44,55,4,55,66,67};
		Set<Integer> numberList = new LinkedHashSet<Integer>(Arrays.asList(numbers));
		System.out.println(numberList);
	}
	
}