package vishal;

class CalculatorTricky{
	int totalSum;
	int answer = 0;
	
	void addition(int num1, int num2){
		answer = num1 + num2;
		totalSum = totalSum + answer;
		System.out.println("Addition of " +num1 + " And " +num2 + " is :" + answer);
	}
	
	void subtraction(int num1, int num2){
		answer = num1 - num2;
		totalSum = totalSum + answer;
		System.out.println("Subtraction of " +num1 + " And " +num2 + " is :" + answer);
	}
	
	void multiplication(int num1, int num2){
		answer = num1 * num2;
		totalSum = totalSum + answer;
		System.out.println("Multiplication of " +num1 + " And " +num2 + " is :" + answer);
	}
	
	void division(int num1, int num2){
		answer = num1 / num2;
		totalSum = totalSum + answer;
		System.out.println("Division of " +num1 + " And " +num2 + " is :" + answer);
	}
	
	void display(){
		System.out.println("Total sum of all 4  :" + totalSum);
	}
	public static void main(String[] arg){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(100,10);
		calculatorTricky.subtraction(200,100);
		calculatorTricky.multiplication(10,10);
		calculatorTricky.division(1000,10);
		calculatorTricky.display();
	}
}

		
