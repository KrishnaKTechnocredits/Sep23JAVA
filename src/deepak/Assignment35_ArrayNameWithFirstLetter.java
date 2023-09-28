/*
Assignment-35 :  26th Sep'2023
Print name and its first letter from given array.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh" }
output : Sayli -> S
         deepak -> d
         Nivedita -> N
		 Yogesh -> Y

*/

package deepak;

import java.util.Arrays;

public class Assignment35_ArrayNameWithFirstLetter {
	
	void getNameWithFirstLetter(String[] input) {
		for(int index = 0 ; index < input.length ; index++){
			String temp = input[index];
			System.out.println(temp+" -> "+temp.charAt(0));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment35_ArrayNameWithFirstLetter getName = new Assignment35_ArrayNameWithFirstLetter();
		
		String[] arr = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		System.out.println("Input: "+Arrays.toString(arr));
		System.out.println("Output: ");
		getName.getNameWithFirstLetter(arr);
	}

}
