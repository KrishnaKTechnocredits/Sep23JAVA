package vishal;

class Assignment15{
	
	int sum;
	
	public void printSumDivisibleBy5And10(int num1, int num2)
	{
		for(int i = num1; i<=num2; i++)
		{
			if(i % 5 == 0 && i % 10 == 0)
			{
				sum = sum + i;
			}	
		}
		System.out.println("sum is :" + sum);
	}
	
	
	public static void main(String [] arg)
	{
		Assignment15 assignment15 = new Assignment15();
		assignment15.printSumDivisibleBy5And10(10,50);
	}
}