//Assignment - 63 : 22nd Oct'2023 1. Count the prime number in range of 50 to 150
//  2.Do sum of number in range of 50 to 150, only if number is odd & prime*

package akshita.array;

import java.util.Scanner;

public class Assignment63 {

	static boolean primeNumber(int num) {
		int sum = 0;
		if (num < 2) {
			return false;
		}
		for (int index = 2; index < num / 2; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Assignment63 ass63 = new Assignment63();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range : ");
		int start = sc.nextInt();
		System.out.println("Enter End Range : ");
		int end = sc.nextInt();
		System.out.println("Given Range is : "+ start +"-" + end);
		int sum = 0;
		int count =0;
		for (int index = start; index <= end; index++) {
			if (primeNumber(index)) {
				count++;
				if(index %2 !=0) {
					//System.out.println(index);
					sum = sum + index;
				}
			} 
			}
		 System.out.println("Count of prime number in given range: " + count);
		 System.out.println("sum of odd & prime number in gievn range  : " +sum);
		 sc.close();
		}
	
	}


