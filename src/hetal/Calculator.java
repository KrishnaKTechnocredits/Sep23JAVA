package hetal;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	void add(){
		int total = num1 + num2;
		System.out.println("Addition of 10 & 2 is "+ total);
	}
	void sub(){
		int sub = num1 - num2;
		System.out.println("sub of 10 & 2 is " + sub);
	}
	void div(){
		int div = num1/num2;
		System.out.println("div of 10 & 2 is " + div);
	}
    void mul(){
        int mul = num1 * num2;
        System.out.println("mul of 10 & 2 is " + mul);
    }		
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.div();
		calculator.mul();
	}	

}