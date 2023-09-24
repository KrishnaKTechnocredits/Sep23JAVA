
/*Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
*/
package jyoti.Ascii;

public class Assignment31 {


	void strCase(String str){
		for(int index=0; index<str.length(); index++){
			char ch= str.charAt(index);
			int temp=ch;
				if(temp>=65 && temp<=90){
					System.out.print(ch);
				}
			
		}
	}
	
	public static void main(String[] args){
		Assignment31 as = new Assignment31();
		as.strCase("TeCHNocreditS");
	}
}
