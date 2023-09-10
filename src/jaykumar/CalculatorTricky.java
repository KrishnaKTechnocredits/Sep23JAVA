package jaykumar;

class CalculatorTricky{
	int total;
	
	void add(int num1, int num2){
		int ans = num1+num2;
		System.out.println("Addition of two numbers is " + ans);
		total = total + ans;
		
	}
	
	void sub(int num1, int num2){
		int ans = num1-num2;
		System.out.println("Substraction of two numbers is " + ans);
		total = total + ans;
		
	}
	
	void mul(int num1, int num2){
		int ans = num1*num2;
		System.out.println("Multiplication of two numbers is " + ans);
		total = total + ans;
		
	}
	
	void div(int num1, int num2){
		int ans = num1/num2;
		System.out.println("Division of two numbers is " + ans);
		total = total + ans;
	}
	
	void printTotal(){
		System.out.println("Addition of answers of all operations is : " +total);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculator = new CalculatorTricky();
		calculator.add(100,50);
		calculator.sub(100,50);
		calculator.mul(100,50);
		calculator.div(100,50);
		calculator.printTotal();
	}
}