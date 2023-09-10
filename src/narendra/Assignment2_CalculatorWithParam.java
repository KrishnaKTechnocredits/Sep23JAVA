package narendra;

class CalculatorWithParam {
	int answer = 0;

	void add(int num1, int num2) {
		answer = num1 + num2;
		System.out.println("Addition of numbers is " + answer);
	}

	void sub(int num1, int num2) {
		answer = num1 - num2;
		System.out.println("Subtraction of numbers is " + answer);
	}

	void mul(int num1, int num2) {
		answer = num1 * num2;
		System.out.println("Multiplication of numbers is " + answer);
	}

	void div(int num1, int num2) {
		answer = num1 / num2;
		System.out.println("Division of numbers is " + answer);
	}

	public static void main(String[] args) {
		CalculatorWithParam calculatorparam = new CalculatorWithParam();
		calculatorparam.add(100, 200);
		calculatorparam.sub(200, 100);
		calculatorparam.mul(10, 20);
		calculatorparam.div(20, 10);
	}
}