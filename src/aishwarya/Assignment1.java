/*Assignment - 1 : 2nd Sep’23
Write Program for calculator which performed operations on instance variables*/
package aishwarya;

class Assignment1 {
	int num1 = 24;
	int num2 = 8;
	
	void add() {
	int ans = num1+num2;
	System.out.println("Addition of 2 numbers :: " +ans);
	}
	
	void sub() {
	int ans = num1-num2;
	System.out.println("Subtraction of 2 numbers :: " +ans);
	}
	
	void multiply() {
	int ans = num1*num2;
	System.out.println("Multiplication of 2 numbers :: " +ans);
	}
	
	void division() {
	int ans = num1/num2;
	System.out.println("Division of 2 numbers :: " +ans);
	}
	
	public static void main(String args[]) {
	Assignment1 obj = new Assignment1();
	obj.add();
	obj.sub();
	obj.multiply();
	obj.division();
	}
}