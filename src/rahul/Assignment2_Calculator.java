package rahul;

class Assignment2_Calculator {
	
	void addition (int num1, int num2) {
		int addAns = num1 + num2;
		System.out.println("Addition of " + num1 + " & " + num2 + " is: " + addAns);
	}
	
	void subtraction (int num1, int num2) {
		int subAns = num1 - num2;
		System.out.println("Subtraction of " + num1 + " & " + num2 + " is: " + subAns);
	}
	
	void multiplication (int num1, int num2) {
		int multiAns = num1 * num2;
		System.out.println("Multiplication of " + num1 + " & " + num2 + " is: " + multiAns);
	}
	
	void division (int num1, int num2) {
		int divAns = num1 / num2;
		System.out.println("Division of " + num1 + " & " + num2 + " is: " + divAns);
	}
	
	public static void main (String args[]) {
		Assignment2_Calculator assignment2_calculator = new Assignment2_Calculator();
		assignment2_calculator.addition(5,5);
		assignment2_calculator.subtraction(10,5);
		assignment2_calculator.multiplication(6,6);
		assignment2_calculator.division(10,2);
	}
}