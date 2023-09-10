// Jaykumar Bankar - Assignment 7
package jaykumar;

class CompareNumbers{
	
	void minimum(int num1, int num2){
		if (num1<num2){
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		}else{
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}
	}
	
	void maximum(int num1, int num2){
		if (num1>num2){
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		}else{
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String[] args){
		CompareNumbers compareNumbers = new CompareNumbers();
		compareNumbers.minimum(10,17);
		compareNumbers.maximum(10,17);
	}
}