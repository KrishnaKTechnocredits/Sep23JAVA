/*Assignment - 61 : 21st Oct'2023
Take 2 valid numbers from user using scanner class and use exception handling mechanims.
*/

package roshani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass61NumberCheckUsingScanner{
	
	void numCheck(){
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true){
			try{
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				break;
			}catch(InputMismatchException ie){
				sc.next();
				System.out.println("Please enter valid number: ");
			}	
		}
		System.out.println("Given numbers are: "+num1+" and "+ num2);
		sc.close();
	}
	
	public static void main(String[] args){
		Ass61NumberCheckUsingScanner assignment61 = new Ass61NumberCheckUsingScanner();	
		assignment61.numCheck();
	}
}


