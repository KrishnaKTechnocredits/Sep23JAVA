package jyoti;
class CalculatorOld{
	int num1=6;
	int num2=3;
	int equal;
	
	void addition(int num1, int num2){
	equal=num1+num2;
	System.out.println("Addition is =" + equal);
	
	}
	void substraction(int num1, int num2){
	int equal=num1-num2;
	System.out.println("Substraction is =" + equal);
	}
	
	void multiplication(int num1, int num2){
	int equal=num1*num2;
	System.out.println("multiplication is =" + equal);
	}
	
	void division(int num1, int num2){
	int equal=num1/num2;
	System.out.println("Division is =" + equal);
	}
	
	public static void main(String[] arg){
	CalculatorOld calc = new CalculatorOld();
	calc.addition(9,6);
	calc.substraction(5,4);
	calc.multiplication(3,9);
	calc.division(81,9);
	
	
	}
	
}	