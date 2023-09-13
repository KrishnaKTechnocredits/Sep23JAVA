package pavan;

class Assi2{
	
	
	void add(int num1 , int num2){
		int answer = num1 + num2;
		System.out.println("Addition = " + answer);
	}
	
	void sub(int num1 , int num2){
		int pavan = num1 - num2;
		System.out.println("Subtraction =  " + pavan);
	}
	
	void Div(int num1 , int num2){
		int division = num1 / num2;
		System.out.println("Division =  " + division);
	}
	
	void Mul(int num1 , int num2){
		int Multiplication = num1 * num2;
		System.out.println("Multiplication =  " + Multiplication);
	}
		
	public static void main (String[] args){
		Assi2 assi2 = new Assi2();
		assi2.add(3,3);
		assi2.sub(6,4);
		assi2.Div(54,44);
		assi2.Mul(23,43);
	}
	
}