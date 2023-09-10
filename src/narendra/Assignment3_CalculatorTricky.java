package narendra;

class CalculatorTricky {
	int answer = 0;
	int totalsum;

	void add(int num1, int num2) {
		answer = num1 + num2;
		totalsum = totalsum + answer;
		System.out.println("Addition of numbers is " + answer);
	}

	void sub(int num1, int num2) {
		answer = num1 - num2;
		totalsum = totalsum + answer;
		System.out.println("Subtraction of numbers is " + answer);
	}

	void mul(int num1, int num2) {
		answer = num1 * num2;
		totalsum = totalsum + answer;
		System.out.println("Multiplication of numbers is " + answer);
	}

	void div(int num1, int num2) {
		answer = num1 / num2;
		totalsum = totalsum + answer;
		System.out.println("Division of numbers is " + answer);
	}

	void display() {
		System.out.println("Total sum is " + totalsum);
	}

	public static void main(String[] args) {
		CalculatorTricky calculatortricky = new CalculatorTricky();
		calculatortricky.add(100, 200);
		calculatortricky.sub(200, 100);
		calculatortricky.mul(10, 20);
		calculatortricky.div(20, 10);
		calculatortricky.display();
//		System.out.println("Total sum is " + calculatortricky.totalsum);
	}
}
