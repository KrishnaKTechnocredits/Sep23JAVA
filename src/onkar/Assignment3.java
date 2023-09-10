package onkar;

class Assignment3{
	
	int finalAnswer;
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of two numbers is "+ans);
		finalAnswer=finalAnswer+ans;
	}
	
	void substract(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction of 2 numbers is "+ans);
		finalAnswer=finalAnswer+ans;
	}
	
	void multiply(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication of 2 numbers is "+ans);
		finalAnswer=finalAnswer+ans;
	}
	
	void divide(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division of 2 numbers is "+ans);
		finalAnswer=finalAnswer+ans;
	}
	
	void printFinalAnswer(){
		System.out.println(finalAnswer);
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.add(10,20);
		assignment3.substract(25,5);
		assignment3.substract(2,15);
		assignment3.multiply(5,7);
		assignment3.divide(35,7);
		assignment3.printFinalAnswer();
	}
}