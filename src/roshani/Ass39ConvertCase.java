/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as it is in 
the given string 
String str = "Yo7GEsH";
output : yO7geSh
*/

package roshani;

public class Ass39ConvertCase{
	void printCases(String input){
		String output = "";
		
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch)){
				output = output + Character.toUpperCase(ch);
			}else if(Character.isUpperCase(ch)){
				output = output + Character.toLowerCase(ch);
			}else if(Character.isDigit(ch)){
				output= output + ch;
			}
		}
		System.out.println("Converted string is: "+ output);
	}
	
	public static void main(String[] args){
		Ass39ConvertCase ass39ConvertCase = new Ass39ConvertCase();
		ass39ConvertCase.printCases("Yo7GEsH");
	}
}