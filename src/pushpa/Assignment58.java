//WAP to print only special characters from the given string.
//String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
//output : "_!# *&%$" 
//Note: including space in between9

package pushpa;

public class Assignment58 {

	public void printSpecialChars(String str) {
		String specialChars = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(Character.isAlphabetic(ch) || Character.isDigit(ch))) {
				specialChars += ch;
			}
		}
		System.out.println(specialChars);
	}

	public static void main(String[] args) {
		new Assignment58().printSpecialChars("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}

}
