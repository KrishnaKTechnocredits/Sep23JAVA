//*WAP to print only special characters from the given string.
//*String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
//*output : "_!# *&%$" 
//*Note: including space in between



package hetal;

public class Assignment58 {
	
	void printSpecialChar(String input) {
		String output = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(!Character.isUpperCase(ch)) {
				if(!Character.isLowerCase(ch)) {
					if(!Character.isDigit(ch)) {
						output = output+ch;
					}
				}
			}
		}
		System.out.println("special character in the given string is -->" + output);
	}
	
	public static void main(String[] args) {
		Assignment58 a = new Assignment58();
		a.printSpecialChar("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}

}
