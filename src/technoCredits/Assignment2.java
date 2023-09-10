package technoCredits;

public class Assignment2 {
	
	void printLengthOfGivenString(String input) {
		for(int index=0;index<input.length();index++) {		
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	
	void printLengthOfGivenStringInRev(String input) {
		for(int index=input.length()-1;index>=0;index--) {		
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.printLengthOfGivenString("technocredits");
		System.out.println("===================");
		assignment2.printLengthOfGivenStringInRev("technocredits");
	}
}
