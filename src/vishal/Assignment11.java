//Print Even Numbers
package vishal;
class Assignment11{
	
	public void printEvenNumbers(int num1, int num2)
	{
		for(int i = num1; i<=num2; i++)
		{
			if(i % 2 ==0)
				System.out.println(i);
		}
	}
	
	
	public static void main(String [] arg)
	{
		Assignment11 assignment11 = new Assignment11();
		assignment11.printEvenNumbers(10,15);
	}
}