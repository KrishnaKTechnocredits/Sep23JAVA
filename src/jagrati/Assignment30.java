/*Assignment-30 : 22nd Sep'2023
	Write a method which takes input and return to return all Uppercase from given input.
	input : "TeCHNocreditS";
	output : TCHNS
	Hint : we can add characters in string like below.
	String output = "";
	output = output + str.charAt(index);
	 */

package jagrati;

public class Assignment30 {
	
	String upperCaseReturn(String input){
		String output ="";
		int index =0;
			while(input.length() > index){
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + input.charAt(index);
				}
			index ++;
		}
		System.out.println("return all Uppercase from given input is = " + output);
		return output;
	}

	public static void main (String args[]){
			Assignment30 assign = new Assignment30();
			String input = "TeCHNocreditS";
			assign.upperCaseReturn(input);
	}	
}