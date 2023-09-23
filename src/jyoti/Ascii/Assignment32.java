
/*
Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4

*/

package jyoti.Ascii;

public class Assignment32 {
	
	void strCase(String str){
		int uCount=0;
		int dCount=0;
		int lCount=0;
		for(int index=0; index<str.length(); index++){
			char ch= str.charAt(index);
			int temp=ch;
				if(temp>=65 && temp<=90){
					uCount++;
					
				}else if(temp>=48 && temp<=57){
					dCount++;
					
				}else if(temp>=97 && temp<=122){
					lCount++;
					
				}else {
					System.out.println("CaseFilter over");
				}
			
		}
		System.out.println("UpperCase count-->"+uCount+'\n'+ "Lowercase Counts-->" + lCount+ '\n'+ "Digits counts -->" + dCount);
	}
	
	public static void main(String[] args){
		Assignment32 cc = new Assignment32();
		cc.strCase("TeCHNoc33r44editS");
	}
}
