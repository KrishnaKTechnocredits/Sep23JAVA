package jagrati;

//Assignment - 2 : 3rd Sep'2023

//Write a program called CalculatorWithParam, all 4 methods should be parameterized.

class CalculatorWithParam{
		int answer;
	
	void addtion(int num1, int num2){
		int answer = num1 + num2;
		System.out.println("addition of two number = "  +  answer);
	}
	
	void subtraction(int num1, int num2){
		int answer = num1 - num2;
		System.out.println("subtraction of two number = "  +  answer);
	}
	
	void multiple(int num1, int num2){
		int answer = num1*num2;
		System.out.println("multiple of two number = "  +  answer);
	}
	
	void divide(int num1, int num2){
		int answer = num1/num2;
		System.out.println("divide of two number = "  +  answer);	
	}

	
}