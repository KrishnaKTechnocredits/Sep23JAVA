package vijay;

class Example2b{
	int num1=10;
	int num2=15;
	
	void processData(){
		num1=num1+num2;
	}
	
	void printInfo(){
		System.out.println(num1+ ":" + num2);
	}
	
	void updateValue(){
		num2=5;
	}
	
	public static void main (String[] args){
		Example2b example2b = new Example2b();
		example2b.processData();
		example2b.updateValue();
		example2b.processData();
		example2b.printInfo();
	}
}
