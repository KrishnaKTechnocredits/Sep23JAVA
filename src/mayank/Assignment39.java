/*Assignment 39: 01st Oct 2023
WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package mayank;

public class Assignment39 {
	
	void convertString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)){
				output = output + Character.toLowerCase(ch);
			}else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			}else {
				output = output + ch;
			}
		}
			System.out.println("-" + output);
	}
		
		public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.convertString("Yo7GEsH");
		}
}

	

