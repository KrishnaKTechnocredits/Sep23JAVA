package sakshi;

class Calculator{
	int num1=10; //instance variable
	int num2=20;
	
	void add(){
		int answer = num1+num2; //local variables
		System.out.println("Addition " + answer);
	}
	
	void sub(){
		int answer = num1-num2; //local variables
		System.out.println("Substraction " + answer);
	}
	
	void multiply(){
		int answer = num1*num2; //local variables
		System.out.println("Multiply " + answer);
	}
	
	void divide(){
		int answer = num1/num2; //local variables
		System.out.println("Divide " + answer);
	}
	
	public static void main (String[] args){
		Calculator calculator =new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multiply();
		calculator.divide();
	}
}