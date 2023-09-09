//Assignment - 7 : 5th Sep'2023 
//Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.
//
//sample input : 
//	num1 : 10
//	num2 : 17
//	output : 10 is smaller between 10 and 17.
//	         
//sample input : 
//	num1 : 10
//	num2 : 17
//	output : 17 is bigger between 10 and 17.
package harshada;
class Example10{
	
	void findMax(int num1,int num2){
		if(num1>num2){
			System.out.println(num1+" is bigger between " + num1 +" and "+ num2);
		}
		else {
			System.out.println(num2+" is bigger between " + num1 +" and "+ num2);
		}
	}
	
	void findMin(int num1,int num2){
		if(num1<num2){
			System.out.println(num1+" is smaller between " + num1 +" and "+ num2);
		}
		else {
			System.out.println(num2+" is smaller between " + num1 +" and "+ num2);
		}
	}
	
	public static void main(String[]args){
		Example10 example10=new Example10();
		example10.findMax(10,17);
		example10.findMin(10,17);		
	}
}