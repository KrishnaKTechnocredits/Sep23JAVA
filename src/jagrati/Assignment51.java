/*
 Assignment-51 : 13th Oct'2023
String str = "technocredits";
output : eoei
String getVowels(String str){
}
output : technocredits -> eoei
 */

package jagrati;

public class Assignment51 {

	String printVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println(" Get vowels from string is = " + output);
		return output;
	}

	public static void main(String[] args) {
		//System.out.println("hi");
		Assignment51 assign = new Assignment51();
		assign.printVowels("technocredits");

	}
}
