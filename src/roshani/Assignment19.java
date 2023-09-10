/*Assignment-19 : 10th Sep'2023
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
	   t*/

package roshani;

public class Assignment19 {
	
	int count = 0;
	
	void printLengthOfGivenString(String input,char ch){
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)== ch) {
				count++;
			}
		}
		System.out.println("\nFrequency of " + ch + " in "+ input + " is: " + count);
	}
	
	void printLengthOfGivenStringInRev(String input,char ch) {
		System.out.println("\nReverse of string " + input + " is: ");
		for(int index=input.length()-1;index>=0;index--) {
			System.out.println(input.charAt(index));
			if(input.charAt(index) == ch) {
				count++;
			}
		}	
	}
	
	public static void main(String[] args){
		Assignment19 assignment19 = new Assignment19();
		assignment19.printLengthOfGivenString("technocredits",'t');
		assignment19.printLengthOfGivenStringInRev("techno",'o');
	}
	
	
}
