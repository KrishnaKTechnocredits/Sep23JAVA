package shamli;

class Calculator{

	int num1=20;
	int num2=15;
	
	void add()
	{
		int addition=num1+num2;
		System.out.println("Addition is :"+addition);
	}
	void sub()
	{
		int subtraction=num1-num2;
		System.out.println("Subtraction is :"+subtraction);
	}
	void mul()
	{
		int mul=num1*num2;
		System.out.println("Multiplication is :"+mul);
	}
	void division()
	{
		int div=num1/num2;
		System.out.println("Division is :"+div);
	}
	
	public static void main(String[] args)
	{
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.division();
	}
}