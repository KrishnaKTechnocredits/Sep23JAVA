//WAP with class name CalculatorTricky, with 4 methods parameterized and write a method that will print addition of answers get from all the methods.

package sakshi;

class CalculatorTricky{
	int total;
	int answer;
	
	void addition(int number1, int number2){
		answer = number1 + number2;
		total = total + answer;
		System.out.println("Addition : " + answer);
	}
	
	void substraction(int number1, int number2){
		answer = number1 - number2;
		total = total + answer;
		System.out.println("Substraction : " + answer);
	}
	
	void multiplication(int number1, int number2){
		answer = number1 * number2;
		total = total + answer;
		System.out.println("Multiplication : " + answer);	
	}
	
	void divide(int number1, int number2){
		answer = number1 / number2;
		total = total + answer;
		System.out.println("Dividation : " + answer);	
	}
	
	void display(){
		System.out.println("The sum of all the operations are " + total);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(10,5);
		calculatorTricky.substraction(3,1);
		calculatorTricky.multiplication(2,5);
		calculatorTricky.divide(10,2);
		calculatorTricky.display();
		
	}
}