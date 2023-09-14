package dhiraj;

public class Assignment19 {
	
	void printlengthReverse(String input){
		for(int index=input.length()-1;index>=0;index--) {
			System.out.println(input.charAt(index));
		}
		
	}
	
	void printFrequencyOfGivenString(String input, char ch) {
		int count=0;
		
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " in" + input + " is " + count );
	}
	
	public static void main(String[] args) {
		Assignment19 assignment = new Assignment19();
		assignment.printlengthReverse("techno");
		assignment.printFrequencyOfGivenString("technocredits",'t' );
		
		
	}
}
