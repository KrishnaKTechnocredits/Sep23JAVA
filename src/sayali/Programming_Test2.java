/* Write a program to rearrange string as per below example.
String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS */

package sayali;

public class Programming_Test2 {
	String uppercasechar="";
	String lowercasechar="";
	String digits="";
	static String temp1="";
	int sum=0;
	
public String getOutputSum(String str){
			for(int index=0 ; index<str.length();index++){
				char ch=str.charAt(index);
				if(Character.isUpperCase(ch)){
					uppercasechar+=ch;
				}else if(Character.isLowerCase(ch)){
					lowercasechar+=ch;
				}else if(Character.isDigit(ch)){
					digits+=ch;
					sum = sum+(Character.getNumericValue(ch));
				}
			}
			temp1 = sum+lowercasechar+uppercasechar;
			return temp1;
	}

public static void main(String[] args){
	Programming_Test2 programmingTest2 = new Programming_Test2();
	String result = programmingTest2.getOutputSum("TeCHNoc33r44editS");
	System.out.println("output : " + result);
	}
}		