
package vishal;
class Assignment12{
	
	public void divisibleBy5And3(int num1, int num2)
	{
		for(int i = num1; i<=num2; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println("Numbers divisible by 3 & 5 are:" + i);
		}
	}
	
	public static void main(String [] arg)
	{
		Assignment12 assignment12 = new Assignment12();
		assignment12.divisibleBy5And3(10,30);
	}
}