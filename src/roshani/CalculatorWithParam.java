 /*Write a program called CalculatorWithParam, all 4 methods should be 
 parameterized. 
 */
package roshani;

class CalculatorWithParam{
	int total;
	
	void add(int num1,int num2){
		int total = num1 + num2; //Local variable
		System.out.println("Addition of two numbers = " + total);
	}
	
	void sub(int num1,int num2){
		int total = num1 - num2;
		System.out.println("Subtraction of two numbers = " + total);
	}
	
	void mult(int num1,int num2){
		int total = num1 * num2;
		System.out.println("Multiplication of two numbers = " + total);
	}
	
	void div(int num1,int num2){
		int total = num1/num2;
		System.out.println("Division of two numbers = " + total);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculator = new CalculatorWithParam();
		calculator.add(100,200);
		calculator.sub(300,100);
		calculator.mult(100,50);
		calculator.div(100,2);
	}
}