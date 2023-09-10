package vishal;

class SmallerBiggerNumber{
	
	void bigNumber(int num1, int num2)
	{
		if(num2>num1)
		{
			System.out.println(num1+ " is smaller between " + num1 + " and " + num2);
		}	
	}
	
	void smallNumber(int num1, int num2)
	{
		if(num1<num2)
		{
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String[] arg)
	{
		SmallerBiggerNumber smallerBiggerNumber = new SmallerBiggerNumber();
		smallerBiggerNumber.smallNumber(1,111);
		smallerBiggerNumber.bigNumber(1,111);
	}
}