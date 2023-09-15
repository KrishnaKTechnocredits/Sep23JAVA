/*1. Print the frequecy of given character from given String.
input : technocredits
        t
		
output : frequency of t in technocredits is 2.
9
2. Print character of given String in reverse order.
input : techno
output : 
       o
	   n
       h
       c
	   e
	   t*/

package onkar;

public class Assignment19 {
	
	void findFrequency(String input) {
		int count = 0;
		
		for (int index=0; index<input.length(); index++) {
			if (input.charAt(index)=='t')
				count++;
		}
		System.out.println("Frequency of t in technocredits is "+count);
	}
	
	void printCharacterReverse (String input) {
		for (int index=input.length()-1; index>=0; index--)
			System.out.println(input.charAt(index));
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.findFrequency("technocredits");
		System.out.println("---------------------------");
		assignment19.printCharacterReverse("techno");
	}
}













