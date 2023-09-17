/*Assignment 3.1 : Write a program called CalculatorTricky, all 4 methods should be parameterized
 and write a method that will print addition of answers get from all the methods. */

package mahesh;

class CalculatorTricky{
	int total;
	
	void addition(int num1,int num2){
		int Addition = num1+num2;
		System.out.println("Addition = " +Addition);
		total = total+Addition;
		}
		
	void subtraction(int num1,int num2){
		int Subtraction = num1-num2;
		System.out.println("Subtraction = " +Subtraction);
		total = total+Subtraction;
		}
		
	void multiplication(int num1,int num2){
		int Multiplication=num1*num2;
		System.out.println("Multiplication = " +Multiplication);
		total = total+Multiplication;
		}
		
	void division(int num1,int num2){
		int Division = num1/num2;
		System.out.println("Division = " +Division);
		total = total+Division;
		}
		
	void display(){
		System.out.println("Total is : " +total);
		}	
		
	public static void main(String[] args){
		CalculatorTricky calculator = new CalculatorTricky();
		calculator.addition(100,100);
		calculator.subtraction(100,50);
		calculator.multiplication(5,2);
		calculator.division(10,2);
		calculator.display();
		}
}