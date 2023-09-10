package mohit;

class Calculator2{
	
	void addition(int num1, int num2){
		int answer = num1 + num2;
		System.out.println("The additon of num1 and num2 is : " + answer);
	}
	void subtraction(int num1, int num2){
		int answer = num1 - num2;
		System.out.println("The subtraction of num1 and num2 is : " + answer);
	}
	void multiplication(int num1, int num2){
		int answer = num1 * num2;
		System.out.println("The multiplication of num1 and num2 is : " + answer);
	}	
	void division(int num1, int num2){
		int answer = num1 / num2;
		System.out.println("The division of num1 and num2 is : " + answer);
	}
	public static void main(String[] args){
		Calculator2 calculator2 = new Calculator2() ;
		calculator2.addition(10, 2);
		calculator2.subtraction(10, 2);
		calculator2.multiplication(10, 2);
		calculator2.division(10, 2);
	}
}
	