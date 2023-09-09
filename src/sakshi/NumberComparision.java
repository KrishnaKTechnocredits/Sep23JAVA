// WAP to find the bigger number

package sakshi;

class NumberComparision{
	
	void maxNumber(int number1, int number2){
		if(number2>number1){
			System.out.println(number1+ " is smaller between " + number1+ " and " +number2);
		}
	}
	
	void minNumber(int number1, int number2){
		if(number1<number2){
			System.out.println(number2+ " is bigger between " + number1+ " and " +number2);
		}
	}
	
	public static void main(String[] args){
		NumberComparision numberComparision = new NumberComparision();
		numberComparision.maxNumber(10,17);
		numberComparision.minNumber(10,17);
	}
}