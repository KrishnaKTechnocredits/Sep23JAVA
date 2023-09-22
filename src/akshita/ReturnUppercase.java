//WAP which take input "TeCHNocreditS" and return to return all uppercase from given input.
//Output :  TCHNS

package akshita;

public class ReturnUppercase {
	
	String retUpper(String input) {
		String output = "";
			for(int index=0;index<input.length();index++) {
				char ch = input.charAt(index);
					if(Character.isUpperCase(ch)) {
						output = output + ch;
					}	
			}
		return output;
	}
	
	public static void main(String[] args) {
		ReturnUppercase returnUppercase = new ReturnUppercase();
		
		System.out.println("Return all uppercase from given input");
		String var = "TeCHNocreditS";
		System.out.println("Input: " + var);
		System.out.print("Output: " );
		
		System.out.println(returnUppercase.retUpper(var));
	}
}
