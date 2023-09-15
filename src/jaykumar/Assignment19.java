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

package jaykumar;

public class Assignment19 {
	
	void charFrequency(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" in "+input+" is "+count);
	}
	
	void charRevOrder(String input) {
		for(int index=input.length()-1; index>=0; index--) {
			System.out.println(input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.charFrequency("technocredits", 't');
		assignment19.charRevOrder("techno");
	}
}
