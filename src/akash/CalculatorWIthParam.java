package akash;

class CalculatorWithParam{
	
	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println("Addition is: " +ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1-num2;
		System.out.println("Substraction is: " +ans);
	}
	
	void mul(int num1, int num2){
		int ans = num1*num2;
		System.out.println("Multiplication is: " +ans);
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println("Division is: " +ans);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorwithparam = new CalculatorWithParam();
		calculatorwithparam.add(10,20);
		calculatorwithparam.sub(20,10);
		calculatorwithparam.mul(5,7);
		calculatorwithparam.div(10,5);
	}
}
