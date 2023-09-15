package jagrati;

//Assignment - 3 : 3rd Sep'2023
//Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
//print addition of answers get from all the methods
//print addition of answers get from all the methods


class CalculatorTricky{
	int total;
	
	void addtion(int num1, int num2){
		int answer = num1 + num2;
		System.out.println("addition of two number = "  +  answer);
		total = total+answer;
	}
	
	void subtraction(int num1, int num2){
		int answer = num1 - num2;
		System.out.println("subtraction of two number = "  +  answer);
		total = total+answer;
	}
	
	void multiple(int num1, int num2){
		int answer = num1*num2;
		System.out.println("multiple of two number = "  +  answer);
		total = total+answer;
	}
	
	void divide(int num1, int num2){
		int answer = num1/num2;
		System.out.println("divide of two number = "  +  answer);
		total = total+answer;
	}
	
	void printTotalValue(){
		System.out.println("Total value of numbers = "  +  total);
	}

	public static void main(String [] args){
		CalculatorTricky calculator = new CalculatorTricky();
		calculator.addtion(200,500);
		calculator.subtraction(500,200);
		calculator.multiple(50,100);
		calculator.divide(1000,200);
		calculator.printTotalValue();
	}
}
