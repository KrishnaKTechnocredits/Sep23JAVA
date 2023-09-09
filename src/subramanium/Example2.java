package subramanium;
class Example2{
	int num1=10;
	int num2=20;
	String name;

	void processData()
	{
	System.out.println(num1+" : "+num2);	//calling values from instance variable
	int num1=100;
	num1=num1+num2;
	num2=num1;
	System.out.println(num1+" : "+num2);  //Printing num 1 from local variable
	
	}
	
	void display()
	{
	System.out.println("Number is" + num1);
	}
	
	public static void main (String[] args){
	 Example2 Example2Obj = new Example2();
	 Example2Obj.processData();
	 Example2Obj.display();
	 Example2Obj.processData();
	 Example2Obj.display();
	}
}