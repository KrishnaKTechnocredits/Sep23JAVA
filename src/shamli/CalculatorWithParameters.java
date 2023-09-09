package shamli;

class CalculatorWithParameters{
	
	int total;
	int add,sub,mul,div;
	//int sub;
	//int mul;
	//int div;
	
	void addition(int num1, int num2){
		add=num1+num2;
		System.out.println("Addition is :"+add);
	}
	void subtraction(int num1, int num2){
		sub=num1-num2;
		System.out.println("Subtraction is :"+sub);
	}
	void multiplication(int num1, int num2){
		mul=num1*num2;
		System.out.println("Multiplication is :"+mul);
	}
	void division(int num1, int num2){
		div=num1/num2;
		System.out.println("Division is :"+div);
	}
	void display(){
		total=add+sub+mul+div;
		System.out.println("Total is :"+total);
	}
	
	public static void main(String[] args){
		CalculatorWithParameters calculator=new CalculatorWithParameters();
		calculator.addition(50,20);
		calculator.subtraction(100,60);
		calculator.multiplication(10,5);
		calculator.division(100,5);
		calculator.display();
	}
}