//WAP to perform Calculator with parameter
package jyoti;
class CalculatorParameter
{
	
	int ans;
	
	void add(int num1,int num2)
	{
		ans=num1+num2;
		System.out.println("Addition is =" + ans);
	
	}
	void sub(int num1,int num2)
	{
		ans=num1-num2;
		System.out.println("Substraction is =" + ans);
	}
	
	void mult(int num1,int num2)
	{
		ans=num1*num2;
		System.out.println("multiplication is =" + ans);
	}
	
	void div(int num1,int num2)
	{
		ans=num1/num2;
		System.out.println("Division is =" + ans);
	}
	
	void printCalculator()
	{
		System.out.println("Please check your answer" + ans);
	}
	
	public static void main(String[] args)
	{
		CalculatorParameter calculator = new CalculatorParameter();
		calculator.add(6,3);
		calculator.sub(6,3);
		calculator.mult(6,3);
		calculator.div(6,3);
		calculator.printCalculator();
	}

}

	