/*Assingment - 26 : 18th Sep'2023
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1*/
package mayank;

public class Assignment26 {
	void printCharFreq(String input){
		while(input.length()>0){
			int orglength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newlength = input.length();
			System.out.println(ch + "-->" + (orglength-newlength));
		}
	}
	public static void main(String[] args){
		Assignment26 assignment26 = new Assignment26();
		assignment26.printCharFreq("aakanksha");
	}
	
}
