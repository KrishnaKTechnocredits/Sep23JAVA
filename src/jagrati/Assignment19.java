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

package jagrati;

public class Assignment19 {
	
	void printFrequecy(String input, char ch) {
		int count =0;
		for(int index =0; index<input.length(); index++) {
			if( ch == input.charAt(index)) {
				count++;
			}
			
		}System.out.println("frequency of t in technocredits is " + count);
	}
	
	void reversChar(String input) {
		for(int index=input.length()-1; index>=0; index--) {
			System.out.println("Character printing revers order " + index + " and " + input.charAt(index));
		
		}
		
	}
	
	public static void main(String [] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printFrequecy("technocredits",'t');
		assignment19.reversChar("techno");
		
	}

	
}
