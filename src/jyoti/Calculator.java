package jyoti;
class Calculator{
	int num1=6;
	int num2=3;
	
	void addition(){
	int equal=num1+num2;
	System.out.println("Addition is =" + equal);
	
	}
	void substraction(){
	int equal=num1-num2;
	System.out.println("Substraction is =" + equal);
	}
	
	void multiplication(){
	int equal=num1*num2;
	System.out.println("multiplication is =" + equal);
	}
	
	void division(){
	int equal=num1/num2;
	System.out.println("Division is =" + equal);
	}
	
	public static void main(String[] arg){
	Calculator calculator = new Calculator();
	calculator.addition();
	calculator.substraction();
	calculator.multiplication();
	calculator.division();
	
	
	}
	
}	