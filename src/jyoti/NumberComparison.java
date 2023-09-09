/*Assignment - 7 : 5th Sep'2023 
Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

sample input : 
	num1 : 10
	num2 : 17
	output : 10 is smaller between 10 and 17.
	         
sample input : 
	num1 : 10
	num2 : 17
	output : 17 is bigger between 10 and 17. */

class NumberComparison{
	
	void printSmallNumber(int num1 ,int num2)
	{
		if (num1 < num2 )
		{
			System.out.println(num1 + ": is smaller between 10 and 17");
		}
		else
		{
			System.out.println(num2 + ": is bigger between 10 and 17");	
		}
		
	}
	
	void printBigNumber(int num1 ,int num2)
	{
		if (num1 > num2 )
		{
			System.out.println(num1 + ": is smaller between 10 and 17");
		}
		else
		{
			System.out.println(num2 + ": is bigger between 10 and 17");	
		}
		
	}
	
	public static void main(String[] args)
	{
		NumberComparison nmcmpr= new NumberComparison();
		nmcmpr.printBigNumber(10,17);
		nmcmpr.printSmallNumber(10,17);
	}


}
