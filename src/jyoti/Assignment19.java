/*
 Assignment-19 : 10th Sep'2023
1. Print the frequecy of given character from given String.
input : technocredits
        t
		
output : frequency of t in technocredits is 2.

2. Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t
 */
package jyoti;

public class Assignment19{
	
		void frequency(String input, char ch) {
			int count=0;
			System.out.println("*****************************************");	
			System.out.println("Frequency of given String");
			System.out.println("========================================");	
				for(int index = 0; index < input.length(); index++){
					if(input.charAt(index) == ch) {
										count = count +1;
					}
				}
				System.out.println("Frequency of this letter is : " +ch +"-> number is: " +count);
		}
	
	void printLengthOfGivenStringInReverse(String input) {
		System.out.println("String in Reverse order");
		System.out.println("========================================");	
		for (int index =( input.length())-1 ; index>=0;index--) {
		
		System.out.println(index + "->" + input.charAt(index));	
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assgn= new Assignment19();
		assgn.printLengthOfGivenStringInReverse("techno");
		assgn.frequency("technocredits",'e');
		assgn.frequency("aabbccdeeeeee",'e');
		assgn.frequency("aabbccdeeeeee",'a');
		assgn.frequency("JyotiSaxena",'a');
	}

}
