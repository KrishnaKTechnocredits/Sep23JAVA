package pratik;

class Calculator{
	int num1=10;
	int num2=2;
	
	void add(){
		int answer=num1+num2;//Local Variable
		System.out.println("Addition of variable is : "+answer);
	}
	
	void sub(){
		int answer=num1-num2;
		System.out.println("Subtraction of variable is : "+answer);
	}
	
	void multi(){
		int answer=num1*num2;
		System.out.println("Multiplication of variable is : "+answer);
	}
	
	void divi(){
		int answer=num1/num2;
		System.out.println("Multiplication of variable is : "+answer);
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.divi();
	} 
}