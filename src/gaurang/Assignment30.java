/*Write a method which takes input and return to return all Uppercase from given input.

input : "TeCHNocreditS";
output : TCHNS*/

package gaurang;

public class Assignment30 {

	String getUpper(String input) {
		String output = "";
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment30 a = new Assignment30();
		String x = a.getUpper("TeCHNocreditS");
		System.out.println(x);
	}
}
