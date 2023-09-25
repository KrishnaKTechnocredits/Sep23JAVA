/* Program 1 : Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS
String getOutput(String input){
} */

package sayali;

public class Programming_Test1 {

	String uppercasechar="";
	String lowercasechar="";
	String digits="";
	static String temp="";
	
	String getOutput(String str){
		for(int index=0 ; index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.isUpperCase(ch)){
				uppercasechar+=ch;
			}else if(Character.isLowerCase(ch)){
				lowercasechar+=ch;
			}else if(Character.isDigit(ch)){
				digits+=ch;
			}else{
				System.out.println("Invalid input");
			}
		}
		temp=digits+lowercasechar+uppercasechar;
		return temp;
	}

public static void main(String[] args){
    Programming_Test1 p = new Programming_Test1();
	p.getOutput("TeCHNoc33r44editS");
	System.out.println("output : " +temp);
	}
}