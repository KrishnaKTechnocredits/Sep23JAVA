package swati;

//ASSIGNMENT 2 : Write a program called CalculatorWithParam, All 4 methods should be parameterized.

class CalculatorWithParam{
	
	void addition(int number1,int number2){
		int add = number1 + number2;
		System.out.println("addition is = " +add);
	}
	
	void subtraction(int number1,int number2){
		int sub =  number1 - number2;
		System.out.println("subtraction is = " +sub);
	}
	void multiplication(int number1,int number2){
		int mul = number1 * number2;
		System.out.println("multiplication is = " +mul);
	}
	
	void division(int number1,int number2){
		int div = number1 / number2;
		System.out.println("division is = " +div);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorwithparam = new CalculatorWithParam();
		calculatorwithparam.addition(60,50);
		calculatorwithparam.subtraction(80,30);
		calculatorwithparam.multiplication(40,90);
		calculatorwithparam.division(50,50);
	}
}