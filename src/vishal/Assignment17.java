package vishal;

class Assignment17{
	
	void divisibleNumber(int startRange, int endRange)
	{
		int count = 0;
		
		System.out.println("Number divisible by 2 & 3 are:");
		
		for(int number=endRange; number>=startRange; number--)
		{
			if (number % 2 ==0 && number % 3 ==0)
			{
				count++;
				if(count>=2 && count<=4)
				{
					System.out.println(" " + number +" ");
					if(count==4)
						break;
				}
			}
		}
	}	
    public static void main(String [] arg)
	{
		Assignment17 assignment17 = new Assignment17();
		assignment17.divisibleNumber(10,100);
	}
}