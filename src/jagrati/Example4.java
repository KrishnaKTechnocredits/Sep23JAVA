package jagrati;

class Example4{
	int num1 =10;
	int num2 =20;
	
	void processData(){
		int num1 =100;
		num1 = num1 + num2;
		num2 = num1;
		System.out.println(num1);
		
	}
	void display(){
		System.out.println(num1 + ":" + num2);
		
	}
	public static void main(String[] args){
		Example4 example4 = new Example4();
		example4.processData();
		example4.display();
		example4.processData();
		example4.display();
		
	}




}