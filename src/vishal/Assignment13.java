
package vishal;
class Assignment13{
	
	int divisibleBy;
	
	public void divisibleBy7or13(int num1, int num2)
	{
		for(int i = num2; i>=num1; i--)
		{
			if(i % 7 == 0 || i % 13 == 0)
			{
				divisibleBy = i % 7 == 0 ? 7: 13;
				System.out.println(i + ":is divisible by :" + divisibleBy);
			}
		}
	}
	
	
	public static void main(String [] arg)
	{
		Assignment13 assignment13 = new Assignment13();
		assignment13.divisibleBy7or13(10,30);
	}
}