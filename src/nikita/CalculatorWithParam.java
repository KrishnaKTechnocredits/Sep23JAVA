package nikita;

class CalculatorWithParam{

	int answer;
		
	void add(int number1,int number2){
		answer= number1+number2;
		System.out.println("The answer of addition is =" +answer);
	}
	
	void substract(int number1,int number2){
		answer= number1-number2;
		System.out.println("The answer of substraction is =" +answer);
	}
	
	void multiply(int number1,int number2){
		answer= number1*number2;
		System.out.println("The answer of multiplication is =" +answer);
	}
	
	void division(int number1,int number2){
		answer= number1/number2;
		System.out.println("The answer of division is =" +answer);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculator= new CalculatorWithParam();
		calculator.add(10,2);
		calculator.substract(10,2);
		calculator.multiply(10,2);
		calculator.division(10,2);
	}
}