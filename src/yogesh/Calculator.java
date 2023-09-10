package yogesh;
class Calculator{
	int num1=10;
	int num2=2;
	
	void add()
	{
		int ans=num1+num2;
		System.out.println("addition is=" +ans);
		
	}
	void sub()
	{
		int ans=num1-num2;
		System.out.println("Substraction is=" +ans);
		
	}
	void multi()
	{
		int ans=num1*num2;
		System.out.println("Multiplication  is=" +ans);
		
	}
	void div()
	{
		int ans=num1/num2;
		System.out.println("Division  is=" +ans);
		
	}	
	public static void main(String[] args)
	{
		Calculator c= new Calculator();
		c.add();
		c.sub();
		c.multi();
		c.div();
	
	}
}
