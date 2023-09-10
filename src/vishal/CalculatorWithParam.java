package vishal;

class CalculatorWithParam{
	int total;
	
	void addition(int num1, int num2){
		total = num1 + num2;
		System.out.println("Addition of " +num1 + " And " +num2 + " is :" + total);
	}
	
	void subtraction(int num1, int num2){
		total = num1 - num2;
		System.out.println("Subtraction of " +num1 + " And " +num2 + " is :" + total);
	}
	
	void multiplication(int num1, int num2){
		total = num1 * num2;
		System.out.println("Multiplication of " +num1 + " And " +num2 + " is :" + total);
	}
	
	void division(int num1, int num2){
		total = num1 / num2;
		System.out.println("Division of " +num1 + " by " +num2 + " is :" + total);
	}
	
	public static void main(String[] arg){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.addition(100,10);
		calculatorWithParam.subtraction(200,100);
		calculatorWithParam.multiplication(10,10);
		calculatorWithParam.division(1000,10);
	}
}

		
