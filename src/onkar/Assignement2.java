package onkar;

class Assignement2{
	
	void add(int num1, int num2){
		int ans = num1 + num2;
		System.out.println("Addition of two numbers is "+ans);
	}
	
	void substract(int num1, int num2){
		int ans = num1 - num2;
		System.out.println("Substraction of 2 numbers is "+ans);
	}
	
	void multiply(int num1, int num2){
		int ans = num1 * num2;
		System.out.println("Multiplication of 2 numbers is "+ans);
	}
	
	void divide(int num1, int num2){
		int ans = num1 / num2;
		System.out.println("Division of 2 numbers is "+ans);
	}
	
	public static void main(String[] args){
		Assignement2 assignement2 = new Assignement2();
		assignement2.add(10,20);
		assignement2.substract(25,5);
		assignement2.substract(2,15);
		assignement2.multiply(5,7);
		assignement2.divide(35,7);
	}
}