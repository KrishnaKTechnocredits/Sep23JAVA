/* Assignment-19 : 10th Sep, 2023
1. Print the frequecy of given character from given String.
Input : technocredits
        t
output : Frequency of t in technocredits is 2.

2. Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t */

package sayali;

public class Assignment_19 {

	void printFrequecyOfChar(String input, char ch) {
		int count =0;
		
		for(int index =0; index<input.length(); index++) {
			if( ch == input.charAt(index)) {
				count++;
			}
		}System.out.println("Frequency of t in technocredits is " + count);
	}

	void reversCharacters(String input) {	
		System.out.println("=================================================================");
		System.out.println("Characters of given string 'techno' in reverse order are as below: ");
		for(int index=input.length()-1; index>=0; index--) {			
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String [] args) {
		Assignment_19 assignment19 = new Assignment_19();
		assignment19.printFrequecyOfChar("technocredits",'t');
		assignment19.reversCharacters("techno");
	}
}