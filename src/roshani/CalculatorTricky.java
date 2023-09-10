//WAP called CalculatorTricky, all 4 methods should be parametrized and 
//write a method that will print addition of answes get from all the methods.
package roshani;

class CalculatorTricky{
	int total;  //Instance Variable
	
	void add(int num1,int num2){
		int answer = num1 + num2; //Local variable
		total = total + answer;
		System.out.println("Addition of two numbers = " + answer);
	}
	
	void sub(int num1,int num2){
		int answer = num1 - num2; //Local variable
		total = total + answer;
		System.out.println("Subtraction of two numbers = " + answer);
	}
	
	void mult(int num1,int num2){
		int answer = num1 * num2; //Local variable
		total = total + answer;
		System.out.println("Multiplication of two numbers = " + answer);
	}
	
	void div(int num1,int num2){
		int answer = num1 / num2; //Local variable
		total = total + answer;
		System.out.println("Division of two numbers = " + answer);
	}
	
	void displayinfo(){
		System.out.println("Total is = " + total);
	}
	public static void main(String[] args){
		CalculatorTricky calculator = new CalculatorTricky();
		calculator.add(10,5);
		calculator.sub(10,5);
		calculator.mult(10,5);
		calculator.div(10,5);
		calculator.displayinfo();
	}
}
