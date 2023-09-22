/*Assignment - 2
Write a program called CalculatorWithParam, all 4 methods should be parameterized.
hint : 
void add(int num1, int num2){

}*/


package mohit;

class CalculatorWithParam{
	
	void addition(int num1, int num2){
		int answer = num1 + num2;
		System.out.println("The additon of num1 and num2 is : " + answer);
	}
	
	void subtraction(int num1, int num2){
		int answer = num1 - num2;
		System.out.println("The subtraction of num1 and num2 is : " + answer);
	}
		
	void multiplication(int num1, int num2){
		int answer = num1 * num2;
		System.out.println("The multiplication of num1 and num2 is : " + answer);
	}
		
	void division(int num1, int num2){
		int answer = num1 / num2;
		System.out.println("The division of num1 and num2 is : " + answer);
	}
		
	public static void main(String[] args){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.addition(10, 2);
		calculatorWithParam.subtraction(10, 2);
		calculatorWithParam.multiplication(10, 2);
		calculatorWithParam.division(10, 2);
	}
}
	
	