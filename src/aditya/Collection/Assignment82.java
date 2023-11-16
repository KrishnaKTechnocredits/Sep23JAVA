package aditya.Collection;
import java.util.*;
public class Assignment82 {
	
	
	public static void main(String[] args)
	{
		Integer[] arr = {10,11,10,44,55,4,55,66,67};
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		Set<Integer> numbers1 = new LinkedHashSet<Integer>();
		for(int num : arr) {
			if(!numbers.add(num)) {
				numbers1.add(num);
			}
		}
		System.out.println(numbers1);
	}
}
