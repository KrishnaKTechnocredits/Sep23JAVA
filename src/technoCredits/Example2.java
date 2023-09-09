package technoCredits;

class Example2{
	int num1=10;
	int num2=15;
	
	void processData(){
		num1 = num1+num2;
	}
	
	void printInfo(){
		System.out.println(num1+ ":" + num2);
	}
	
	void updateValue(){
		num2=5;		
	}
	
	public static void main(String[] args){
		Example2 example2 = new Example2();
		example2.processData();
		example2.updateValue();
		example2.processData();
		example2.printInfo();
	}
}
