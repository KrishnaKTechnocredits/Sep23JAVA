//Assignment#2 WAP to perform Calculator with parameter
package jyoti;
class CalculatorP
{
	int ans;
	void add(int num1,int num2)
	{
		ans=num1+num2;
		System.out.println("Addition of given number is =" + ans);
	}
	void sub(int num1,int num2)
	{
		ans=num1-num2;
		System.out.println("Substraction of given number is =" + ans);
	}
	void mult(int num1,int num2)
	{
		ans=num1*num2;
		System.out.println("multiplication of given number is =" + ans);
	}
		void div(int num1,int num2)
	{
		ans=num1/num2;
		System.out.println("Division of given number is =" + ans);
	}
	public static void main(String[] args)
	{
		CalculatorP calculator = new CalculatorP();
		calculator.add(6,3);
		calculator.sub(6,3);
		calculator.mult(6,3);
		calculator.div(6,3);
	}

}

	