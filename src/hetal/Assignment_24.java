package hetal;

public class Assignment_24 {
	
	void printSum(String input) {
		int sum=0;
		for(int index=0; index<input.length();index++)
			if (Character.isDigit(input.charAt(index))) {
				sum=sum + Character.getNumericValue(input.charAt(index));
			}
	System.out.println("sum of all digits in given output " + sum);
	}
	
	public static void main(String[] args) {
		Assignment_24 assignment_24 = new Assignment_24();
		assignment_24.printSum("Rah5ulTEC6Hnoc2redltS");
	}
	

}
	
