//Assignment - 62 : 21st Oct'2023
//Using exception handling write below code.
//String str = "I have total 9 years and 2 months of experience";
//output : 11
//String[] word = str.split(" ");
//sum =  sum + Integer.parseInt;



package akshita.array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment62 {
	
	void getSumDigit(String[] input) {
		int sum=0;
		for(int index=0;index<input.length;index++) {
			try {
				sum =sum + Integer.parseInt(input[index]);
				
			}
			catch(NumberFormatException ne) {
				//System.out.println(ne.getMessage());
			}
		}
		System.out.println("Sum of digit in a string =>" + sum);
	}

	public static void main(String[] args) {
		Assignment62 assg62 = new Assignment62();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String input : ");
		String str = sc.nextLine();
		//String str = "I have total 9 years and 2 months of experience";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output : ");
        assg62.getSumDigit(arr);
        sc.close();
	}

}
