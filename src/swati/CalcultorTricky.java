package swati;

//ASSIGNMENT : 3 Write a program called CalcultorTricky, All 4 methods should be parameterized and write a method that will print addtion ofanswers get from all the methods

class CalcultorTricky{
	int total;
	
	void addition(int number1,int number2){
		int addtiontotal = number1 + number2;
		System.out.println("Addition total is = " +addtiontotal);
		total = total + addtiontotal;
	}
	
	void subtraction(int number1,int number2){
		int subtractiontotal = number1 - number2;
		System.out.println("subtraction total is = " +subtractiontotal);
		total = total + subtractiontotal;
	}
	void multiplication(int number1,int number2){
		int multiplicationtotal = number1 * number2;
		System.out.println("multiplication total is = " +multiplicationtotal);
		total = total + multiplicationtotal;
	}
	
	void division(int number1,int number2){
		int divisiontotal = number1 / number2;
		System.out.println("division total is = " +divisiontotal);
		total = total + divisiontotal;
	}
	
	void printTotal(){
		System.out.println("All operation combined Total is = " +total);
	}
	
	public static void main(String[] args){
		CalcultorTricky calcultortricky = new CalcultorTricky();
		calcultortricky.addition(200,100);
		calcultortricky.subtraction(200,100);
		calcultortricky.multiplication(200,100);
		calcultortricky.division(200,100);
		calcultortricky.printTotal();
	}
}