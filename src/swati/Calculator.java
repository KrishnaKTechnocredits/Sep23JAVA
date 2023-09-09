package swati;

class Calculator{
	int x = 20;
	int y = 20;
	
	void addition(){
		int add=x+y;
		System.out.println("Addition result is = "+add);
	}
	
	void subtraction(){
		int sub=x-y;
		System.out.println("subtraction result is = "+sub);
	}
	
	void multiplication(){
		int mul=x*y;
		System.out.println("multiplication result is = "+mul);
	}
	
	void division(){
		int div=x/y;
		System.out.println("division result is = "+div);
	}
	
	public static void main(String[] s){
	Calculator c=new Calculator();
	c.addition();
	c.subtraction();
	c.multiplication();
	c.division();
	}
}