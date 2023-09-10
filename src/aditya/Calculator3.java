package aditya;
class Calculator3{
	int answer;
	void add(int no1,int no2){
		int answer = no1+no2;
		System.out.println("Addition of numbers " + answer);
	}
	
	void sub(int no1,int no2){
		int answer = no1-no2;
		System.out.println("Subtraction of numbers " + answer);
	}
	
	void Multiply(int no1,int no2){
		int answer = no1 * no2;
		System.out.println("Multiplication of numbers " + answer);
	}
	
	void Division(int no1,int no2){
		int answer = no1/no2;
		System.out.println("Division of numbers " + answer);
	}

	public static void main(String[] args){
		Calculator3 calculator = new Calculator3();
		calculator.add(10,20);
		calculator.sub(20,10);
		calculator.Multiply(10,0);
		calculator.Division(10,10);
	}
}
