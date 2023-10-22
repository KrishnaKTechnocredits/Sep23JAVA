package technoCredits.revisin;

public class Assignment2 {
	
	void printLengthOfGivenString(String input) {
		for(int index=0;index<input.length();index++) {		
			System.out.println(index + "->" + input.charAt(index));
		}
	}
	
	void printLengthOfGivenStringInRev(String input,char ch) {
		int count = 0;
		for(int index=input.length()-1;index>=0;index--) {		
			System.out.println(index + "->" + input.charAt(index));
			if(input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("frequency of "+ch+" is " + count);
	}
	
	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		assignment2.printLengthOfGivenString("technocredits");
		System.out.println("===================");
		assignment2.printLengthOfGivenStringInRev("technocredits",'e');
	}
}
