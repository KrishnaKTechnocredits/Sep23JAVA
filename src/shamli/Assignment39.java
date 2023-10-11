/*
 * Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh
 */


package shamli;

public class Assignment39 {

		String convertCase(String input) {
			System.out.println("Input string is :"+input);
			String output="";
			for(int index=0;index<input.length();index++) {
				char ch=input.charAt(index);
				if(Character.isUpperCase(ch)) {
					ch=Character.toLowerCase(ch);
					output=output+ch;
				}else if(Character.isLowerCase(ch)) {
					ch=Character.toUpperCase(ch);
					output=output+ch;
				}
			}
			return output;
		}
		
		public static void main(String[] args) {
			Assignment39 assignment39=new Assignment39();
			String output=assignment39.convertCase("Yo7GEsH");
			System.out.println("Ouput string is :"+output);
	}

}
