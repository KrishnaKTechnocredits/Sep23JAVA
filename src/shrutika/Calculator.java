package shrutika;
class Calculator {
    int num1=10;
	int num2=20;
	
    void add(){
		int answer=num1+num2;
		System.out.println("Addition=" +answer);
	}
    void sub(){
		int answer=num1-num2;
		System.out.println("Subtraction=" +answer);
	}
	void div(){
		double answer=num1/num2;
		System.out.println("Devison=" +answer);
	}
	void mul(){
		int answer=num1*num2;
		System.out.println("Multiplication=" +answer);
	}
	
    public static void main(String[] args) {
		 Calculator calculator =new Calculator();
		 calculator.add();
		 calculator.sub();
		 calculator.div();
		 calculator.mul();
	 }
}
