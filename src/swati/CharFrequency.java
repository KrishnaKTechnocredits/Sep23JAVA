/*Assignment-19 : 10th Sep'2023
 *  1. Print the frequency of given character from given String. input : technocredits       
t output : frequency of t in technocredits is 2.*/

package swati;

public class CharFrequency {
	
	void printChar(String input,char ch) {
		int count = 0;
		for(int index=0;index<=input.length()-1;index++) {
			if(input.charAt(index) == ch) {
			count++;
			}
		}		
		System.out.println("frequency of "+ch+" in technocredits is "+count);
	}

	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		charFrequency.printChar("technocredits",'t');
	}
}
