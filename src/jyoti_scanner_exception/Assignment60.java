/*Assignment - 60 : 21st Oct'2023

Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4*/

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment60 {

	int getSum(String str) {
		int sum=0;
		for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index);
		if (Character.isDigit(ch)) {
			sum=sum+Character.getNumericValue(ch);
		}
		}return sum;
		
	}
	
	public static void main(String[] args) {
		Assignment60 ass = new Assignment60();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Please entrer the String");
		String str=sc.next();
		//ass.getSum(str);
		System.out.println("Sum-->"+ass.getSum(str));
		System.out.println("Would you like to continue Yes/No");
		String temp=sc.next();
		if(temp.equals("No")) {
			break;
			//System.out.println("Exit");
		}
	}sc.close();
	}
}
	

