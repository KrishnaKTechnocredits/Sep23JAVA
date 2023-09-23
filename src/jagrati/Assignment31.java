/*Write a method which takes input and return all Uppercase from given input using ascii.
input : "TeCHNocreditS";output : TCHNS
 */

package jagrati;

public class Assignment31 {
	
	String getUppercase(String input) {
		for (int index=0; index< input.length(); index++) {
			char ch = input.charAt(index);
			int output = ch; 
			if(output > 65 && output <90) {
				System.out.print("all Uppercase from given input using ascii is = "+ ch);
			}
		}
		return input;
	}
	public static void main(String[] args) {
		String output = new Assignment31().getUppercase("TeCHNocreditS");
	}
}	

			