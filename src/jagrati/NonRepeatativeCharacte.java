package jagrati;

public class NonRepeatativeCharacte {
	
	
	int nonRepeatChar(String input) {
		
		for(int index =0; index < input.length(); index ++) {
			char ch  = input.charAt(index);
			if (input.indexOf(ch)== input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
		return 0;

	}
	
	public static void main(String[] args) {
		NonRepeatativeCharacte nonRepChar = new NonRepeatativeCharacte();
		nonRepChar.nonRepeatChar("technocredits");
	}
}
