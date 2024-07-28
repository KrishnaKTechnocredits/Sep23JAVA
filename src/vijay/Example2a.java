package vijay;

class Example2a{
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
		Example2a example2a = new Example2a();
		example2a.processData();
		example2a.updateValue();
		example2a.printInfo();
	}
}
