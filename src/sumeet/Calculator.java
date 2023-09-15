package sumeet;

class Calculator{
	int num1=10;
	int num2=2;
	
	void add(){
		int answer= num1+num2;
		System.out.println("Addition =" +answer);
	}
	
	void sub(){
		int answer= num1-num2;
		System.out.println("Subtraction =" +answer);
	}
	
	void multi(){
		int answer= num1*num2;
		System.out.println("Multiplication =" +answer);
	}
	
	void dev(){
		int answer= num1/num2;
		System.out.println("Devision =" +answer);
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.multi();
		calculator.dev();
	}

}