package jagrati;

//Assignment - 7 : 5th Sep'2023 
//Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

class Sample{
	
	void findMaxNumber( int num1, int num2){
		if (num1 < num2){
			System.out.println( num1 + " is smaller between " + num1 + " and " + num2);
		}	
	}
	
	void findMimNumber(int num1, int num2){
		if (num1 < num2){
			System.out.println( num2 + " is bigger between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String [] args){
		Sample sample = new Sample();
		sample.findMaxNumber(10,17);
		sample.findMimNumber(10,17);
	}
}


