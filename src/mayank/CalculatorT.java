//calculator tricky
package mayank;
class CalculatorT{
	int total;
	
	void add(int num1,int num2){
		int answer = num1 + num2;
		total = total + answer;
		System.out.println("Addition is =" + answer);
	}
	
	void sub(int num1,int num2){
		int answer = num1-num2;
		total = total + answer;
		System.out.println("Subtraction is =" + answer);
	}
	
	void mul(int num1,int num2){
		int answer = num1 * num2;
		total = total + answer;
		System.out.println("Multiplication  is ="  + answer);
	}
	
	void div(int num1,int num2){
		int answer = num1 / num2;
		total = total + answer;
		System.out.println("division is =" + answer);
	}
	
	void display(){
		System.out.println("Total is =" + total);
	}
	
	public static void main(String[] args){
		CalculatorT calculator = new CalculatorT();
		calculator.add(30,30);
		calculator.sub(10,10);
		calculator.mul(50,60);
		calculator.div(5,10);
		calculator.display();
	}
} 