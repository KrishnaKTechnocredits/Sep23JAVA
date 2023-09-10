package shrutika;
//Assignment 7
class Number{
	
	void maxNumber(int num1, int num2){
		if (num1 > num2){
			System.out.println(num1+" is Bigger between "+num1 +" and "+num2);
		}else {
		    System.out.println(num2+" is Bigger between "+num1 +" and "+num2);
		}
	}			
	
	void minNumber(int num1, int num2){
		if (num1 < num2){
			System.out.println(num1+" is Smaller between "+num1 +" and "+num2);
		}else {
			System.out.println(num2+" is Smaller between "+num1 +" and "+num2);
		}
	}
	
	public static void main(String[] args){
		Number number = new Number();
		number.maxNumber(10,17);
		number.minNumber(17,10);
	}
}