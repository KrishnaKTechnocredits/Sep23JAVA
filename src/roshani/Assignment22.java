/*Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis*/

package roshani;

public class Assignment22 {
	
	void printUniqueChar(String input){
		for(int index = 0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)){
				System.out.print(ch);
			}	
		}
	}
		
	public static void main(String[] args){
		Assignment22 assignemnt22 = new Assignment22();
		assignemnt22.printUniqueChar("technocredits");
	}
}
