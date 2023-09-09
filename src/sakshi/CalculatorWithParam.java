//WAP called CalculatorWithParam, all 4 methods should be parameterized. (Assignment 2)

package sakshi;

class CalculatorWithParam{
	int total;
	
	void addition(int number1, int number2){
		total = number1+number2;
		System.out.println("The addition of "+number1 + " and " + number2 + " is " + total);
	}
	
	void substraction(int number1, int number2){
		total = number1-number2;
		System.out.println("The substraction of "+number1 + " and " + number2 + " is " + total);
	}
	
	void multiplication(int number1, int number2){
		total = number1*number2;
		System.out.println("The multiplication of "+number1 + " and " + number2 + " is " + total);
	}
	
	void divide(int number1, int number2){
		total = number1/number2;
		System.out.println("The dividation of "+number1 + " and " + number2 + " is " + total);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.addition(10,5);
		calculatorWithParam.substraction(3,1);
		calculatorWithParam.multiplication(2,5);
		calculatorWithParam.divide(10,2);
	}
}