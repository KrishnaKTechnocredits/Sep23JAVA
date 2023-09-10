//Write a program called Calculator Calculator, all 4 methods should be parameterized 

package sayali;

class Calculator1{
	int answer;
	
	void Addition(int no1, int no2){
		int answer = no1+no2;
		System.out.println("Addition of numbers " + answer);
	}
	
	void Subtraction(int no1, int no2){
		int answer = no1 - no2;
		System.out.println("Subtraction of numbers " + answer);
	}
	
	void Multiplication(int no1, int no2){
		int answer = no1 * no2;
		System.out.println("Multiplication of numbers " + answer);
	}
	
	void Division(int no1, int no2){
		int answer = no1/no2;
		System.out.println("Division of numbers " + answer);
	}
	
	public static void main(String[] args){
		Calculator1 calculator = new Calculator1();
		calculator.Addition(10,20);
		calculator.Subtraction(20,10);
		calculator.Multiplication(10,20);
		calculator.Division(30,20);
	}	
} 