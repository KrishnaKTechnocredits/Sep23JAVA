/*Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will print addition of answers get from all the methods.
int total;
void add(int num1, int num2){
	int ans = num1 + num2;
	total = total + ans;
}
void sub(int num1, int num2){
// 5
}
void display(){
	sop(total); //20
}*/
package deepak;
class CalculatorTricky_Assignment3{
	int totalAnswer;
	
	void add(int num1, int num2){
		int answer = num1+num2;
		System.out.println("Addition of numbers is: "+answer);
		totalAnswer = totalAnswer+answer;
	}
	
	void subtract(int num1, int num2){
		int answer = num1-num2;
		System.out.println("Substract of numbers is: "+answer);
		totalAnswer = totalAnswer+answer;
	}
	
	void multiply(int num1, int num2){
		int answer = num1*num2;
		System.out.println("Multiply of numbers is: "+answer);
		totalAnswer = totalAnswer+answer;
	}
	
	void divide(int num1, int num2){
		int answer = num1/num2;
		System.out.println("Division of numbers is: "+answer);
		totalAnswer = totalAnswer+answer;
	}
	
	void displayTotal(){
		System.out.println("Total of all operations is "+ totalAnswer);
	}
	
	public static void main(String[] args){
		CalculatorTricky_Assignment3 calculator = new CalculatorTricky_Assignment3();
		calculator.add(10, 5);
		calculator.subtract(20, 5);
		calculator.multiply(10, 4);
		calculator.divide(15, 3);
		calculator.displayTotal();
	}	
}
