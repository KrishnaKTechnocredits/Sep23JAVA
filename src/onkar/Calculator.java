// calculator class with 4 methods

package onkar;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int answer = num1+num2;
		System.out.println("Addition is "+answer);
	}
	
	void substract(){
		int answer = num1-num2;
		System.out.println("Substraction is "+answer);
	}
	
	void multiply(){
		int answer = num1*num2;
		System.out.println("Multiplication is "+answer);
	}
	
	void division(){
		int answer = num1/num2;
		System.out.println("Division is "+answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.substract();
		calculator.multiply();
		calculator.division();
	}
}