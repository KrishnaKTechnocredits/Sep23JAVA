package gaurang;

class CalculatorWithParam{
	
	void add(int num1,int num2){
		int total = num1 +num2;
		System.out.println("Addition of "+num1+" and "+num2+" is " + total);
	}
	
	void sub(int num1,int num2){
		int total = num1 - num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+total);
	}
	
	void mul(int num1,int num2){
		int total = num1 * num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+total);
	}
	
	void div(int num1,int num2){
		int total = num1 / num2;
		System.out.println("Division of "+num1+" and "+num2+" is "+total);
	}
	
	public static void main(String[] args){
		CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
		calculatorWithParam.add(10,5);
		calculatorWithParam.sub(10,5);
		calculatorWithParam.mul(10,5);
		calculatorWithParam.div(10,5);
	}
}	