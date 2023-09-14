package akash;


class Calculator{
	int num1 = 8;
	int num2 = 5;
	
	void add(){
		int ans = num1+num2;
		System.out.println("Addtion= "+ ans);
	}
	
	void sub(){
		int ans = num1-num2;
		System.out.println("Substration= "+ ans);
	}
	
	void mul(){
		int ans = num1*num2;
		System.out.println("Multiplication ="+ ans);
	}
	
	void div(){
		int ans = num1/num2;
		System.out.println("Division= "+ ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}