package denish;

class Trickey{
	int total;
	
	void add(int num1, int num2){
		int answer = num1 + num2;
		total = total + answer;
		System.out.println("Addition of number "+ answer);
	}
	
	void sub(int num1, int num2){
		int answer = num1 - num2;
		total = total + answer;
		System.out.println("Subtraction of number "+ answer);
	}
	
	void mul(int num1, int num2){
		int answer = num1 * num2;
		total = total + answer;
		System.out.println("Multification of number "+ answer);
	}
	
	void div(int num1, int num2){
		int answer = num1 / num2;
		total = total + answer;
		System.out.println("Division of number "+ answer);
	}
	
	void display(){
		System.out.println("Total Count of Number "+total);
	}
	
	public static void main(String[] args){
		Trickey trickey = new Trickey();
		trickey.add(12,15);
		trickey.sub(100,15);
		trickey.mul(30,15);
		trickey.div(120,10);
		trickey.display();
	}
}