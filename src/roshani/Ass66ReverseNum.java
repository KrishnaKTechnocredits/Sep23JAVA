/*
Assignment-66 : 28th Oct'2023
WAP to return reverse number without converting it to String.

input : 123
output : 321
*/
package roshani;

public class Ass66ReverseNum{
	void reverseNum(int input){
		int output = 0; 
		System.out.println(input + " is the input number.");
		while(input > 0){
			output = output * 10 + input % 10;
			input = input / 10;
		}
		
		System.out.println("Reverse of input is: " + output);
	}
	public static void main(String[] args){
		Ass66ReverseNum assignment66 = new Ass66ReverseNum();
		assignment66.reverseNum(123);
	}
}