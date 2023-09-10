// WAP for 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

package sayali;

class CompareNumbers{

	void maxNumber(int number1, int number2){
		if(number1 > number2){
			System.out.println(number1+ " is bigger between " + number1+ " and " +number2);
		}
		else{
			System.out.println(number2+ " is bigger between " + number1+ " and " +number2);
		}
	}
	
	void minNumber(int number1, int number2){
		if(number1 < number2){
			System.out.println(number1+ " is smaller between " + number1+ " and " +number2);
		}
		else{
			System.out.println(number2+ " is smaller between " + number1+ " and " +number2);
		}
	}
	
	public static void main(String[] args){
		CompareNumbers compareNumbers = new CompareNumbers();
		compareNumbers.maxNumber(10,17);
		compareNumbers.minNumber(10,17);
	}
}