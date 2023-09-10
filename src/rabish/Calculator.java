package rabish;
class Calculator {
	int x =8;
	int y=7;
	
	void add()
	{
	 int ans=x+y;
	 System.out.println("Sum of Number=" + ans);
	}
	
	void sub()
	{
	 int ans=x-y;
	 System.out.println("Subtraction of Number=" + ans);
	}
	
	void multiply()
	{
	 int ans=x*y;
	 System.out.println("Multiplication of Number=" + ans);
	}
	
	void division()
	{
	 int ans=x/y;
	 System.out.println("Division of Number=" + ans);
	}
	
	public static void main(String[] args){
	Calculator c = new Calculator();
		c.add();
		c.sub();
		c.multiply();
		c.division();
		
	}
}