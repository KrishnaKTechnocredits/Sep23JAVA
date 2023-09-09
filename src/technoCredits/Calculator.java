package technoCredits;

class Calculator{
	int num1 = 10; // Instance variable
	int num2 = 2; // Instance variable
	int answer = 0;
	
	void add(){
		answer = num1+num2; // Local variable
		System.out.println("Addition = " + answer);
	}
	
	void sub(){
		answer = num1-num2;
		System.out.println("Subtraction = " + answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
	}
}