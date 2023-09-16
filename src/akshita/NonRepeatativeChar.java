//WAP to print non repeatative character from given String

package akshita;

public class NonRepeatativeChar {

	void findNonRepeChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					System.out.print(ch);
			    }
		}	
	}
	
	public static void main(String[] args) {
		NonRepeatativeChar nonRepeatativeChar = new NonRepeatativeChar();
		System.out.println("Non Repetative character");
		System.out.println(" ");
		
		String var = "technocredits";
		System.out.println("Input : " + var);
		System.out.println(" ");
		
		System.out.print("Output :");
		nonRepeatativeChar.findNonRepeChar(var);
		
	}
}
