/*WAP to convert lowercase character to uppercase and uppercase character to lowercase
 input:Yo7GEsH__yO7gesh */

package hetal;

public class Assignment39 {
	
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
		Assignment39 assignment39 = new Assignment39();
		assignment39.printLowerUpper("Yo7GEsH");
	}
}
