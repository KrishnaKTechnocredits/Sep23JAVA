package rahul;

class Assignment3_Calculator {
	int totalAdd;
	int totalSub;
	int totalMulti;
	int totalDiv;
	
	void addition (int num1, int num2) {
		totalAdd = num1 + num2;	
	}
	
	void subtraction (int num1, int num2) {
		totalSub = num1 - num2;
	}
	
	void multiplication (int num1, int num2) {
		totalMulti = num1 * num2;
	}
	
	void division (int num1, int num2) {
		totalDiv = num1 / num2;
	}
	
	void additionOfAllOperators() {
		int finalTotal = totalAdd + totalSub + totalMulti + totalDiv;
		System.out.println("Final total is: " +finalTotal);
	}
	
	public static void main (String args[]) {
		Assignment3_Calculator assignment3_calculator = new Assignment3_Calculator();
		assignment3_calculator.addition(2,2);
		assignment3_calculator.subtraction(10,5);
		assignment3_calculator.multiplication(6,6);
		assignment3_calculator.division(10,2);
		assignment3_calculator.additionOfAllOperators();
	}
}