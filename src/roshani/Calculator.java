 /*class
 addition, sub, mult,div
 
 x, y
 x-y
 print
 */
package roshani;

class Calculator{
	int num1 = 10;  //Instance Variable
	int num2 = 2;  //Instance Variable
	
	void add(){
		int answer = num1+num2; //Local variable
		System.out.println("Addition of Variable is= "+answer);
	}
	
	void sub(){
		int answer = num1-num2;
		System.out.println("Subtraction of Variable is= "+answer);
	}
	
	void mult(){
		int answer = num1*num2;
		System.out.println("Multiplication of Variable is= "+answer);
	}
	
	void div(){
		int answer = num1/num2;
		System.out.println("Division of Variable is= "+answer);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mult();
		calculator.div();
	}
}