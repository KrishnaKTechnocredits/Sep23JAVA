package subramanium;
class Calculator{
	int num1=10;
	int num2=5;

	void add()
	{
		int answer=num1+num2;
		System.out.println("Addition is "+answer);
		
	}
	void sub()
	{
		int answer=num1-num2;
		System.out.println("Subtraction is "+answer);
		
	}
	void div()
	{
		int answer=num1/num2;
		System.out.println("Division is "+answer);
		
	}
	void multiply()
	{
		int answer=num1*num2;
		System.out.println("Multiplication is "+answer);
		
	}
	public static void main(String[] args)
	{
		 Calculator CalculatorObj =new Calculator();
		 CalculatorObj.add();
		 CalculatorObj.sub();
		 CalculatorObj.multiply();
		 CalculatorObj.div();
}
}