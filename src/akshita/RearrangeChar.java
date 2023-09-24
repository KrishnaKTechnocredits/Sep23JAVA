//WAP to rearrange string as per below: Input: "TeCHNoc33r44editS"
//Output: 333344eocreditTCHNS


package akshita;

public class RearrangeChar {

	void displayChar(String input) {
		String digit = "";
		String lower ="";
		String upper ="";
			for(int index=0;index<input.length();index++) {			
				char ch= input.charAt(index);
					if(Character.isDigit(ch)) {
						digit= digit + ch;
					}
					else if(Character.isLowerCase(ch)) {
						lower= lower + ch;	
			        }
					else if (Character.isUpperCase(ch)){
						upper= upper + ch;	
					}	
			}
		System.out.println("Output : " + digit + lower + upper);	
	}

	public static void main(String[] args) {
		RearrangeChar rearrangeChar = new RearrangeChar();
		
		String var = "TeCHNoc33r44editS";
		System.out.println("Input : " + var);
		rearrangeChar.displayChar(var);
	}
}
