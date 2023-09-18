//WAP to print first non repeatative character using while loop .Input:"technocredits"

package akshita;

public class NonRepetitiveChar {

	void nonRep(String input) {
		while(input.length()>0) {
			int actualLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(input.valueOf(ch), "");
			int newLength = input.length();
				if(actualLength-newLength == 1) {
					System.out.println("Output : " + ch);
					break;
				}
		}
	}
	
	public static void main(String[] args) {
		NonRepetitiveChar nonRepetitiveChar = new NonRepetitiveChar();
		String var = "technocredits";
		System.out.println("First Non Repetitve Character");
		System.out.println("Input : "+ var);
		nonRepetitiveChar.nonRep(var);
	}

}
