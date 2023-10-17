/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres
*/
package roshani;

public class Ass41StringFromFirstVowel{
	void printString(String input){
		String output = "";
		for(int index = 0; index < input.length(); index++){
		
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				output = output + input.substring(index);
				System.out.print("Output is: "+ output);
				break;
			}
		}		
	}
	
	public static void main(String[] args){
		Ass41StringFromFirstVowel assignment41 = new Ass41StringFromFirstVowel();
		assignment41.printString("pqrabcgtyes");
	}
}
