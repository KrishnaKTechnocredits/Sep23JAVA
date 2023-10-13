/*Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/

package gaurang;

public class Assignment31 {

	String getUpper(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch>=65 && ch <=90) {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment31 a = new Assignment31();
		String x = a.getUpper("TeCHNocreditS");
		System.out.println(x);
	}
}
