package aditya;
class Calculator{
	int no1= 10;
	int no2= 2;
	
	void add(){
		int answer = no1+no2;
		System.out.println("Addition of numbers" + answer);
	}
	
	void sub(){
		int answer = no1-no2;
		System.out.println("Subtraction of numbers" + answer);
	}
	
	void Multiply(){
		int answer = no1 * no2;
		System.out.println("Multiplication of numbers" + answer);
	}
	
	void Division(){
		int answer = no1/no2;
		System.out.println("Division of numbers" + answer);
	}

	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.Multiply();
		calculator.Division();
	}
}
