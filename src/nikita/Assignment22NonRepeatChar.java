package nikita;

public class Assignment22NonRepeatChar {

	void getNonRepeatChar(String input) {
		for(int i=0; i<input.length();i++) {
			char ch= input.charAt(i);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.print(ch);
			}		
		}
	}

	public static void main(String[] args) {
		Assignment22NonRepeatChar assignment22= new Assignment22NonRepeatChar();
		assignment22.getNonRepeatChar("technocredits");
	}
}
