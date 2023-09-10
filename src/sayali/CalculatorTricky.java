/*Write a program called Calculator CalculatorTricky, all 4 methods should be parameterized 
and write a method that will print addition of answers get from all the methods */

package sayali;

class CalculatorTricky{
	int answer=0;
	int totalsum;
	
	void Add(int no1, int no2){
		int answer = no1+no2;
		totalsum = totalsum + answer;
		System.out.println("Addition of numbers is " + answer);
	}
	
	void Sub(int no1, int no2){
		int answer = no1 - no2;
		totalsum = totalsum + answer;
		System.out.println("Subtraction of numbers is " + answer);
	}
	
	void Multiply(int no1, int no2){
		int answer = no1 * no2;
		totalsum = totalsum + answer;
		System.out.println("Multiplication of numbers is " + answer);
	}
	
	void Division(int no1, int no2){
		int answer = no1/no2;
		totalsum = totalsum + answer;
		System.out.println("Division of numbers is " + answer);
	}
	
	void display(){
		System.out.println("Addition of answers from all operations is " + totalsum);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculator = new CalculatorTricky();
		calculator.Add(200,100);
		calculator.Sub(300,200);
		calculator.Multiply(10,20);
		calculator.Division(30,20);
		calculator.display();
	}	
} 