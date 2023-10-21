//Using scanner class, print digit sum of each name.
//input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
//output :  Say2al1i -> 3 ,Ad9it5ya -> 14  , Shr4utik2a -> 6 ,Saks4hi -> 4
		  

package akshita.array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment60 {

	void sumDigit(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum= sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(input + "=>" + sum);
	}
	
	void arrayString(String input) {
		System.out.println("Sum of digit from string :  ");
		String[] arr = input.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int index=0 ; index < arr.length; index++) {
			sumDigit(arr[index]);
		}	
	}
	
	public static void main(String[] args) {
		Assignment60 ass60 = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = sc.nextLine();	
		ass60.arrayString(str);
		sc.close();
	}
}
