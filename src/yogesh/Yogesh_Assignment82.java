//Assignment-82 : 4th Nov'2023
//
//Return all duplicate number from all given numbers in appropiate Data structure.
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,55]
package yogesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Yogesh_Assignment82 {

	Set<Integer> getDuplicateNum(Integer[] num){
		System.out.println("Input:--"+Arrays.toString(num));
		Set<Integer> hs=new HashSet<Integer>();
		Set<Integer> hs1=new LinkedHashSet<Integer>();

		for(int input:num) {
			if(!hs.add(input)) {
				hs1.add(input);
			}
		}
		return hs1;
	}
	public static void main(String[] args) {
		Yogesh_Assignment82 assignment82=new Yogesh_Assignment82();
		Integer[] input= {10,11,10,44,55,4,55,66,67};
		System.out.println("Output:--"+assignment82.getDuplicateNum(input));
	}
}
