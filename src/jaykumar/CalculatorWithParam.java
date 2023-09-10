package jaykumar;

class CalculatorWithParam{

	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println("Addition of two numbers is " + ans);
	}
	
	void sub(int num1, int num2){
		int ans = num1-num2;
		System.out.println("Substraction of two numbers is " + ans);
	}
	
	void mul(int num1, int num2){
		int ans = num1*num2;
		System.out.println("Multiplication of two numbers is " + ans);
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println("Division of two numbers is " + ans);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculator = new CalculatorWithParam();
		calculator.add(10,20);
		calculator.sub(50,70);
		calculator.mul(7,8);
		calculator.div(16,4);
	}
}