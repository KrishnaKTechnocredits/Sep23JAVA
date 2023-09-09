//Assignment#3 WAP to perform Calculator with parameter
package jyoti;
class CalculatorTotal
{	
	int ans;
	int totalAll;
	
	void add(int num1,int num2)
	{
		ans=num1+num2;//9
		totalAll=totalAll+ans;//9
		System.out.println("Addition of given number is =" + ans);
	}
	void sub(int num1,int num2)
	{
		ans=num1-num2;//3
		totalAll=totalAll+ans;//12
		System.out.println("Substraction of given number is =" + ans);
	}
	void mult(int num1,int num2)
	{
		ans=num1*num2;//18
		totalAll=totalAll+ans;//30
		System.out.println("multiplication of given number is =" + ans);
	}
	void div(int num1,int num2)
	{
		ans=num1/num2;//2
		totalAll=totalAll+ans;//32
		System.out.println("Division of given number is =" + ans);
		System.out.println("Total of given number is =" + totalAll);
	}
	public static void main(String[] args)
	{
		CalculatorTotal calculator = new CalculatorTotal();
		calculator.add(6,3);
		calculator.sub(6,3);
		calculator.mult(6,3);
		calculator.div(6,3);
	}

}

	