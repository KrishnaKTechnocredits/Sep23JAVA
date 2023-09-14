package nikita;

class CalculatorTricky{
	
	int answer=0;
	int finalAnswer;
		
	void add(int number1,int number2){
		answer= number1+number2;
		finalAnswer=finalAnswer+answer;
		System.out.println("The answer of addition is =" +answer);		
	}
	
	void substract(int number1,int number2){
		answer= number1-number2;
		finalAnswer=finalAnswer+answer;
		System.out.println("The answer of substraction is =" +answer);
	}
	
	void multiply(int number1,int number2){
		answer= number1*number2;
		finalAnswer=finalAnswer+answer;
		System.out.println("The answer of multiplication is =" +answer);
	}
	
	void division(int number1,int number2){
		answer= number1/number2;
		finalAnswer=finalAnswer+answer;
		System.out.println("The answer of division is =" +answer);
	}
	
	void display(){
		System.out.println("The final answer of addition of all methods is = " +finalAnswer);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatortricky= new CalculatorTricky();
		calculatortricky.add(10,2);
		calculatortricky.substract(10,2);
		calculatortricky.multiply(10,2);
		calculatortricky.division(10,2);
		calculatortricky.display();
	}

}