package vishal;

class Assignment18{
	
	void processData(int startIndex, int endIndex)
	{
		int sum = 0;
		int average =0;
		int count = 0;
		
		System.out.println("\nIn tha Range of : " + startIndex + " to " + endIndex + "numbers which are divisible by 5 and 7 are:");
		for(int num = startIndex; num<=endIndex; num++)
		{
			if(num % 5 == 0 && num % 7 ==0)
			{
				System.out.println(num);
				count++;
				sum = sum + count;
			}
		}
		if(sum != 0 && count != 0)
		{
			average=sum/count;
		}
		System.out.println("\nFound " + count + " numbers");
		System.out.println("\nSum of three numbers is : " + sum);
		System.out.println("\nAverage is : " + average);
	}
	
	public static void main(String [] arg)
	{
		Assignment18 assignment18 = new Assignment18();
		assignment18.processData(1,110);
	}
	
}
