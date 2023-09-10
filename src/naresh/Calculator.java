package naresh;

class Calculator{
	int num1=10;
	int num2=20;
	
	void addition(){
		int ans=num1+num2;
		System.out.println("Addition is "+ans);
		
	}
	
	void subtract(){
		int ans=num1-num2;
		System.out.println("Subtraction is "+ans);
		
	}
	
	void multiplication(){
		int ans=num1*num2;
		System.out.println("Subtraction is "+ans);
		
	}
	
		void div(){
		int ans=num1/num2;
		System.out.println("division is "+ans);
		
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.addition();
		calculator.subtract();
		calculator.multiplication();
		calculator.div();
		
		
		
	}
}

