package vishal;

class Assignment14{
	
	int notDivisibleBy;
	
	public void divisibleBy5And9(int num1, int num2)
	{
		for(int i = num2; i>=num1; i--)
		{
			if(i % 5 == 0 && i % 9 == 0)
			{
				notDivisibleBy = i;
				break;
			}	
		}
		System.out.println("Last number divisible by 5 and 9 is :" + notDivisibleBy);	
	}
	
	public static void main(String [] arg)
	{
		Assignment14 assignment14 = new Assignment14();
		assignment14.divisibleBy5And9(5,100);
	}
}