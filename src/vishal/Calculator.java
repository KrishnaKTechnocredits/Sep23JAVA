package vishal;

class Calculator{
	int num1 = 10; //Instance Variable
	int num2 = 2;  //Instance Variable

	void add (){
		int answer = num1+num2;  //Local Variable
		System.out.println("Addition of Variables is = " + answer);	
	}
	void sub (){
		int answer = num1-num2;  //Local Variable
		System.out.println("Subtraction of Variables is = " + answer);	
	}
	
	void mult (){
		int answer = num1*num2;  //Local Variable
		System.out.println("Multiplication of Variables is = " + answer);
	}
	void div (){
		int answer = num1/num2;  //Local Variable
		System.out.println("Division of Variables is = " + answer);	
	}
	
	public static void main(String[] args){   
		   Calculator calculator = new Calculator();
		   calculator.add();
		   calculator.sub();
		   calculator.mult();
		   calculator.div();	   
	}
 }