package akash;

class CalculatorTricky{
	int total;
	int ans;
	void add(int num1, int num2){
		ans = num1+num2;
		System.out.println("Addition is: " +ans);
		total = total + ans;
	}
	
	void sub(int num1, int num2){
		ans = num1-num2;
		System.out.println("Substraction is: " +ans);
		total = total + ans;
	}
	
	void mul(int num1, int num2){
		ans = num1*num2;
		System.out.println("Multiplication is: " +ans);
		total = total + ans;
	}
	
	void div(int num1, int num2){
		ans = num1/num2;
		System.out.println("Division is: " +ans);
		total = total + ans;
	}
	
	void display(){
		System.out.println("The sum of all operations are: " + total);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatortricky = new CalculatorTricky();
		calculatortricky.add(10,20);
		calculatortricky.sub(20,10);
		calculatortricky.mul(5,7);
		calculatortricky.div(10,5);
		calculatortricky.display();
	}
}