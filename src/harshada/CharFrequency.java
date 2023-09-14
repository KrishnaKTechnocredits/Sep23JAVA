//1. Print the frequecy of given character from given String.
//input : technocredits
//Assignment-19 : 10th Sep'2023		
//output : frequency of t in technocredits is 2.

package harshada;

public class CharFrequency {
	
	void printFrequency(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			if(ch== input.charAt(index))
				count++;
		}
		System.out.println("frequency of "+ch+" is "+count);
		System.out.println(input.length());
	}
	
		void printReverse(String input) {
			for(int index=input.length()-1; index>=0;index--) {
				System.out.println(input.charAt(index));
			}
		}
	
	public static void main(String[] args) {
		CharFrequency charFrequency=new CharFrequency();
		charFrequency.printFrequency("technocredits", 't');
		charFrequency.printReverse("techno");
	}
}
