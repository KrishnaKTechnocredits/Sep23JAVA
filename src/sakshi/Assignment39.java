//Assignment 39: 01st Oct 2023
//WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
//String str = "Yo7GEsH";
//output : yO7geSh

package sakshi;

public class Assignment39{

	void printAlphabetCase(String input){
		String tempCase="";
		for(int index=0; index<input.length(); index++){
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)){
				tempCase = tempCase + Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)){
				tempCase = tempCase + Character.toUpperCase(ch);
			}else{
				tempCase = tempCase+ch;
			}
		}
		System.out.println("Before " +input);
		System.out.println("After " +tempCase);
	}
	
	public static void main(String[] args){
		Assignment39 assignment39 = new Assignment39();
		String str = "Yo7GEsH";
		assignment39.printAlphabetCase(str);
	}
}