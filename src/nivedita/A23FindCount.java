/*
Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.
String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1
*/
package nivedita;
public class A23FindCount{


	void checkString(String input){
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int spaceCount=0;
		int sCount=0;

		for (int index=0;index<input.length();index++){
			if (Character.isUpperCase(input.charAt(index))){
				uCount++;
				}
				else if(Character.isLowerCase(input.charAt(index))){
					lCount++;
				}
				else if(Character.isDigit(input.charAt(index))){
				dCount++;
				}
				else if(input.charAt(index)== ' '){
			spaceCount++;		
			}
			else{
			sCount++;
			}
	}
	System.out.println("Lowercase count-->"+lCount+'\n'+"Uppercase Count-->"+uCount+'\n'+"Digit--->"+dCount+'\n'+"Space counts-->"+spaceCount+'\n'+"SpecialCharacterCount--->"+sCount);	
}

	public static void main(String[] args){
		A23FindCount findCount = new A23FindCount();
		findCount.checkString ("TecHNo_cR6ediTs");
	}
}