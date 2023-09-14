package mohit;

class Calculator{
	int num1=10;//instance variable
	int num2=2;//instance variable
	
	void add(){
		int answer=num1+num2;//local variable
		System.out.println("Addition= " + answer);
	}
	void sub(){
		int answer= num1-num2;
		System.out.println("Subtraction= " + answer);
	}
	void multi(){
		int answer= num1*num2;
		System.out.println("Multiplication= " + answer);
	}
	void div(){
		int answer= num1/num2;
		System.out.println("Division= " + answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.div();
		
	}
}