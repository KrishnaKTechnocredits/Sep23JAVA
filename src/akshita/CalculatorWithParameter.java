package akshita;

class CalculatorWithParameter{

	void add(int num1, int num2){
	   int add = num1 + num2;
	   System.out.println("Addition: " + add);
	}
	
    void sub(int num1, int num2){
	   int sub = num1 - num2;
	   System.out.println("Sustraction: " + sub);
	}
	
	void mul(int num1, int num2){
	   int mul = num1 * num2;
	   System.out.println("Multiplication : " + mul);
	}
	
	void div(int num1, int num2){
	   int div = num1 / num2;
	   System.out.println("Division:  " + div);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();	
	}
}