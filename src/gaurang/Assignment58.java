/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between
In case you are really blocked, refer  #836 for my approach*/

package gaurang;

public class Assignment58 {

	void getChar(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(!Character.isUpperCase(ch)) {
				if(!Character.isLowerCase(ch)) {
					if(!Character.isDigit(ch)) {
						output += ch;
					}
				}
			}
		}
		System.out.println("Special Characters in given String are --> "+"("+output+")");
	}
	
	public static void main(String[] args) {
		Assignment58 a = new Assignment58();
		a.getChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
