/*WAP for calculator having 4 methods (Add, Subtract, multiply and divide) performing actions for two numbers as 10 and 2.*/
package deepak;

class Calculator_Assignment1 {
	int num1 = 10;
	int num2 = 2;

	void add() {
		int answer = num1 + num2;
		System.out.println("Addition of variables is " + answer);
	}

	void sub() {
		int answer = num1 - num2;
		System.out.println("Substration of variables is " + answer);
	}

	void mul() {
		int answer = num1 * num2;
		System.out.println("Multiplication of variables is " + answer);
	}

	void div() {
		int answer = num1 / num2;
		System.out.println("Division of variables is " + answer);
	}

	public static void main(String[] args) {
		Calculator_Assignment1 calculator = new Calculator_Assignment1();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}