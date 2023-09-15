//print frequency of given character from given string

package akash;

public class Assignment19 {
	
	void frequencyOfChar(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch)
				count++;
		}
		System.out.println("Frequency of t in technocredits is "+count);
	}
	
	void printCharacterReverse(String input) {
		for(int index=input.length()-1;index>=0;index--) {
			System.out.println(input.charAt(index));
		}
		
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.frequencyOfChar("technocredits", 't');
		System.out.println("===============================");
		assignment19.printCharacterReverse("techno");
	}
}
