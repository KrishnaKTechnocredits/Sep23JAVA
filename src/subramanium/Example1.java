package subramanium;
class Example1{
	int num;
	String name;

	void processData()
	{
	num=10;
	}
	
	void display()
	{
	System.out.println("Number is" + num);
	}
	
	public static void main (String[] args){
	 Example1 ExampleObj = new Example1();
	 ExampleObj.display();
	 ExampleObj.processData();
	 ExampleObj.display();
	}
}