/*Write a program called CalculatorWithParam, all 4 methods should be parameterized.
hint : 
void add(int num1, int num2){
}
*/
package deepak;
class CalculatorWithParam_Assignment2{
	int answer;

	void add(int num1, int num2){
		answer=num1+num2;
		System.out.println("Addition of numbers is: "+answer);
	}
	
	void subtract(int num1, int num2){
		answer=num1-num2;
		System.out.println("Subtraction of numbers is: "+answer);
	}
	
	void multiply(int num1, int num2){
		answer=num1*num2;
		System.out.println("Multiplication of numbers is: "+answer);
	}
	
	void divide(int num1, int num2){
		answer=num1/num2;
		System.out.println("Division of numbers is: "+answer);
	}
	
	public static void main(String[] args){
		CalculatorWithParam_Assignment2 calculator = new CalculatorWithParam_Assignment2();
		calculator.add(10, 5);
		calculator.subtract(20, 10);
		calculator.multiply(10, 2);
		calculator.divide(20, 5);
	}
}