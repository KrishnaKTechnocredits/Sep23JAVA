/* Assignment 39
WAP to convert lowercase character to uppercase and uppercase character to lowercase
 input:Yo7GEsH__yO7gesh */

package nivedita;

public class A39ConvertChar {
	
	void printLowerUpper(String input){
		String count="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)){
				count=count+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				count=count+Character.toUpperCase(ch);
			}
			else{
				count = count + ch;
			}
		}
		System.out.println("coverted string is " + count);
	}
	
	public static void main(String[] args) {
		A39ConvertChar convertChar = new A39ConvertChar();
		convertChar.printLowerUpper("Yo7GEsH");
	}
}
