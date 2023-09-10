package technoCredits;

public class Assignment2 {
	
	void printLengthOfGivenString(String input) {
		for(int index=0;index<input.length();index++) {		
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.printLengthOfGivenString("technocredits");
	}
}
