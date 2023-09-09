package harshada;
class Calculator{
	int num1=10;
	int num2=2;
	
	void add(){
		int answer=num1+num2;
		System.out.println("Addition of variaable is "+answer);
	}
	
	void sub(){
		int answer=num1-num2;
		System.out.println("Substraction of variaable is "+answer);
	}
	
	void div(){
		int answer=num1/num2;
		System.out.println("Division of variaable is "+answer);
	}
	
	void mul(){
		int answer=num1*num2;
		System.out.println("Multiplication of variaable is "+answer);
	}
	
	public static void main(String[] args){
		Calculator calculater = new Calculator();
		calculater.add();
		calculater.sub();
		calculater.div();
		calculater.mul();
	}
}