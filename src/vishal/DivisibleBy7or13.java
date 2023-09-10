package vishal;

class DivisibleBy7or13{
	
	public void printDivisible(int startRange, int endRange)
	{
		System.out.println("Divisible by 7 and 13 numbers are: ");
		for(int num=endRange; num>=startRange; num--)
		{
			if(num % 7 == 0)
			{
				System.out.println(num + ": is divisible by 7");
			}
			else if (num % 13 == 0)
			{
				System.out.println(num + ": is divisible by 13");
			}
		}
	}
	
	public static void main(String [] arg)
	{
		DivisibleBy7or13 divisibleBy7or13 = new DivisibleBy7or13();
		divisibleBy7or13.printDivisible(10,30);
	}
}