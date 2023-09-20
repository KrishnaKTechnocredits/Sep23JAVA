/*
 Assignment - 2 :

Write a program called CalculatorWithParam, all 4 methods should be parameterized.
hint : 
void add(int num1, int num2){

}
 */

package nivedita;
class A2CalWithParam {
	int add;
	int substract;
	int multiply;
	int divide;
	
	void addCal(int num1, int num2){
		add = num1 + num2;
	}
	
	void substractCal(int num1, int num2){
		substract = num1 - num2;
	}
	
	void multiply(int num1, int num2){
		multiply = num1 * num2;
	}
	
	void divide(int num1, int num2){
		divide = num1 / num2;
	}
	
	void print(){
		System.out.println("The Addition is " + add);
		System.out.println("The Substraction is " + substract);
		System.out.println("The Multiplication is " + multiply);
		System.out.println("The Division is " + divide);
	}
	
	public static void main(String[] args){
	
	A2CalWithParam calWithParam = new A2CalWithParam ();
	calWithParam.addCal(2,2);
	calWithParam.substractCal(2,2);
	calWithParam.multiply(2,2);
	calWithParam.divide(2,2);
	calWithParam.print();
	
	}
}