//Assignment 2 : Write a program called CalculatorWithParam, all 4 methods should be parameterized.

package mahesh;

class CalculatorWithParam{
		void addition(int num1,int num2){
		int Addition = num1+num2;
		System.out.println("Addition = " +Addition);
		}
		
	void subtraction(int num1,int num2){
		int Subtraction = num1-num2;
		System.out.println("Subtraction = " +Subtraction);
		}
		
	void multiplication(int num1,int num2){
		int Multiplication=num1*num2;
		System.out.println("Multiplication = " +Multiplication);
		}
		
	void division(int num1,int num2){
		int Division = num1/num2;
		System.out.println("Division = " +Division);
		}
		
	public static void main(String[] args){
		CalculatorWithParam calculator = new CalculatorWithParam();
		calculator.addition(100,100);
		calculator.subtraction(100,50);
		calculator.multiplication(5,2);
		calculator.division(10,2);
		}
}