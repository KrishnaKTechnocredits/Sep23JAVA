/*Assignment - 3 : 3rd Sep'2023
Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.

Hint : 
int total;

void add(int num1, int num2){
	int ans = num1 + num2;
	total = total + ans;
}

void sub(int num1, int num2){
	int ans = num1 - num2;
	total = total + ans;
}

void display(){
	sop(total); //20
}*/

package mohit;


class CalculatorTricky{
	int total;
	
	void addition(int num1, int num2){
		int answer = num1 + num2;
		total = total + answer;
	}
	
	void subtraction(int num1, int num2){
		int answer = num1 - num2;
		total = total + answer;
	}
		
	void multiplication(int num1, int num2){
		int answer = num1 * num2;
		total = total + answer;
	}
		
	void division(int num1, int num2){
		int answer = num1 / num2;
		total = total + answer;
	}
	
	void display(){
		System.out.println("The addition of answers get from all the methods is : " + total);
	}
		
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.addition(10, 2);
		calculatorTricky.subtraction(10, 2);
		calculatorTricky.multiplication(10, 2);
		calculatorTricky.division(10, 2);
		calculatorTricky.display();
	}
}
	
	