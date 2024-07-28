package vijay;

class Example6{
	int num1 = 10;
	int num2 = 20;
	
	void processData(){
		int num1 = 100;
		num1 = num1 + num2;
		num2 = num1;
		System.out.println(num1);
	}
	
	void display(){
		System.out.println(num1 + "-" + num2);
	}
	
	public static void main(String[] args){
		Example6 example6 = new Example6();
		example6.processData();
		example6.display();
		example6.processData();
		example6.display();
	}
}