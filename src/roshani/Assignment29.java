/*Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : h
*/

package roshani;

public class Assignment29{

	void lastNonRepChar(String str){
		while(str.length()>1){
			int orgLen = str.length();
			char ch = str.charAt(str.length()-1);
			str = str.replace(String.valueOf(ch),"");
			int newLen = str.length();
			if(orgLen-newLen > 1 ){
				System.out.println("Last non-repeatative character in given string is: '" +ch+"'");
				break;
			}
		}
	}	
	
	public static void main(String[] args){
		Assignment29 assignment29 = new Assignment29();
		assignment29.lastNonRepChar("technocredits");
	}
}