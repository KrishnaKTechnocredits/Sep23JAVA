package mayank;

class Calculator{
	int num1 = 10;//Instance variable
	int num2 = 2;//Instance variable
	
	void add(){
			int answer = num1+num2;//Local variable
			System.out.println("Addition = " + answer);
	}
	void sub(){
		int answer = num1-num2;
		System.out.println("Subtraction = " + answer);
	}
	void mul(){
		int answer = num1*num2;
		System.out.println("multiplication = " + answer);
	}
	void Div(){
		int answer = num1/num2;
		System.out.println("Division = " + answer);
	}
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.Div();
	}	
}	