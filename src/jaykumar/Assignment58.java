/*Assignment-58 : 13th Oct'2023
WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach*/

package jaykumar;

public class Assignment58 {
	
	void printSpChar(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(!Character.isLetterOrDigit(ch)) {
				output += ch;
			}
		}
		System.out.println("Given string is: "+input);
		System.out.println("Special chars in string are: "+output);
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		assignment58.printSpChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
