package narendra;

class Calculator {
	int num1 = 100;
	int num2 = 20;
	int answer = 0;

	void add() {
		answer = num1 + num2;
		System.out.println("Addition of numbers is " + answer);
	}

	void sub() {
		answer = num1 - num2;
		System.out.println("Subtraction of numbers is " + answer);
	}

	void mul() {
		answer = num1 * num2;
		System.out.println("Multiplication of numbers is " + answer);
	}

	void div() {
		answer = num1 / num2;
		System.out.println("Division of numbers is " + answer);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}
