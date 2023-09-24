/*
 * Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}

Program 2 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS

String getOutput(String input){

}
 */
package shamli;

public class ProgrammingTest1 {
	
	void printExpectedString1(String input) {
		String strUcase1="";
		String strLcase1="";
		String strDigit1="";
		String outputstr1="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				strUcase1=strUcase1+ch;
			}else if(Character.isLowerCase(ch)) {
				strLcase1=strLcase1+ch;
			}else if(Character.isDigit(ch)) {
				strDigit1=strDigit1+ch;
			}
		}
		outputstr1=strDigit1+strLcase1+strUcase1;
		System.out.println("Output string is :"+outputstr1);
	}
	
	void printExpectedString2(String input) {
		int sum=0;
		String strUcase2="";
		String strLcase2="";
		String outputstr2="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				strUcase2=strUcase2+ch;
			}else if(Character.isLowerCase(ch)) {
				strLcase2=strLcase2+ch;
			}else if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		outputstr2=sum+strLcase2+strUcase2;
		System.out.println("Output string is :"+outputstr2);
	}
	
	public static void main(String[] args) {
		ProgrammingTest1 test1=new ProgrammingTest1();
		test1.printExpectedString1("TeCHNoc33r44editS");
		test1.printExpectedString2("TeCHNoc33r44editS");
	}
}
