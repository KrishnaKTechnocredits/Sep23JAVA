package vijay;

class Calculator{
	int num1=10;
	int num2=2;
	
	void add(){
		int answer=num1+num2;
		System.out.println("Addition = " + answer);
	}
	
	void sub(){
		int answer=num1-num2;
		System.out.println("Substraction = " + answer);
	}
	
	void mul(){
		int answer = num1*num2;
		System.out.println("Multiplication = " + answer);
	}
	
	void div(){
		int answer = num1/num2;
		System.out.println("Division = " + answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}